package controlador;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import view.LoginForm;
import view.PagoForm;
import view.RegisterForm;
import ws.WSOperaciones;

public class LoginControl implements Eventos {

    WSOperaciones cliente;
    LoginForm vista;

    public static int id_user = 0;

    public LoginControl(WSOperaciones cliente, LoginForm vista) {
        this.cliente = cliente;
        this.vista = vista;

        vista.getContentPane().setBackground(new Color(255, 255, 255));
        vista.setVisible(true);
        vista.setResizable(false);
        vista.setTitle("Login");
        vista.setLocationRelativeTo(null);
        vista.getJlRegistrarse().setToolTipText("¡Registrate!");

    }

    private void ingresar() {

        String username = vista.getTxt_username().getText();
        String password = String.valueOf(vista.getTxt_password().getPassword());

        if (!username.isEmpty() && !password.isEmpty()) {
            int auth = cliente.login(username, password);
            if (auth != 0) {
                
                id_user = auth;
                
                JOptionPane.showMessageDialog(vista, htmlMessage("Bienvenido"), "Mensaje", 1);

                TransactionControl pagoControl = new TransactionControl(cliente, new PagoForm());
                pagoControl.listeners();
                vista.dispose();
            } else {
                JOptionPane.showMessageDialog(vista, htmlMessage("Datos ingresados incorrectos"), "Advertencia", 0);
            }

        } else {
            JOptionPane.showMessageDialog(vista, htmlMessage("Ingrese los datos indicados"), "Mensaje", 1);
        }

    }

    @Override
    public void listeners() {
        vista.getBtn_login().addActionListener(l -> ingresar());
        vista.getTxt_password().addActionListener(l -> ingresar());
        vista.getJlRegistrarse().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                register();
            }

        });

    }

    private void register() {
        RegisterControl registerControl = new RegisterControl(cliente, new RegisterForm());
        registerControl.listeners();
        vista.dispose();
    }

    private String htmlMessage(String text) {

        return "<html><h3 style='font-family: 'Trebuchet MS'; font-weight:bold;'>" + text + "</h3></html>";
    }

}
