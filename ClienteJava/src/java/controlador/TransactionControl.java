package controlador;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import view.LoginForm;
import view.PagoForm;
import ws.UsuarioVo;
import ws.WSOperaciones;

public class TransactionControl implements Eventos {

    WSOperaciones cliente;
    PagoForm vista;
    private int id_user = 0;

    public TransactionControl(WSOperaciones cliente, PagoForm vista) {
        this.cliente = cliente;
        this.vista = vista;

        vista.getContentPane().setBackground(new Color(255, 255, 255));
        vista.setVisible(true);
        vista.setResizable(false);
        vista.setTitle("Pagos");
        vista.setLocationRelativeTo(null);
        vista.getTxt_saldo().setEnabled(false);
        id_user = LoginControl.id_user;

        loadProfileInformation();
    }

    private void loadProfileInformation() {

        UsuarioVo uv = cliente.getDataByUser(id_user);
        vista.getJlbienvenida().setText("Bienvenido/a : " + uv.getUsuario());
        vista.getTxt_saldo().setText(String.valueOf(uv.getSaldo()));

    }

    private void registrar() {

        String rbuttonSelected = getSelectedbtgenero(vista.getBgOpciones());
        if (rbuttonSelected != null) {

            if (!vista.getTxt_valor().getText().trim().isEmpty()) {

                double saldo = Double.parseDouble(vista.getTxt_saldo().getText());
                double valor = Double.parseDouble(vista.getTxt_valor().getText());

                String message = cliente.doTransaction(id_user, rbuttonSelected, saldo, valor);

                vista.getJlMensaje().setText(message);
                loadProfileInformation();

            } else {
                JOptionPane.showMessageDialog(vista, htmlMessage("Ingrese el valor de la transacción"), "Advertencia", 2);
            }

        } else {
            JOptionPane.showMessageDialog(vista, htmlMessage("Seleccione la operación a realizar"), "Advertencia", 2);
        }
    }

    private String getSelectedbtgenero(ButtonGroup bt_genero) {
        for (Enumeration<AbstractButton> buttons = bt_genero.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    private String htmlMessage(String text) {

        return "<html><h3 style='font-family: 'Trebuchet MS'; font-weight:bold;'>" + text + "</h3></html>";
    }

    private void cleanForm() {

        vista.getBgOpciones().clearSelection();
        vista.getTxt_valor().setText("");
        vista.getJlMensaje().setText("");
    }
    
    private void logOut(){
        
        LoginControl loginControl = new LoginControl(cliente, new LoginForm());
        loginControl.listeners();
        vista.dispose();
    }

    @Override
    public void listeners() {
        vista.getBtn_registrar().addActionListener(l -> {
            registrar();
        });
        vista.getBtn_reload().addActionListener(l->cleanForm());
        
        vista.getJlcerrarSesion().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logOut();
            }
        
             
        });
        
    }

}
