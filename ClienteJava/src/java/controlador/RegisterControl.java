package controlador;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import view.LoginForm;
import view.RegisterForm;
import ws.WSOperaciones;

public class RegisterControl implements Eventos {

    WSOperaciones cliente;
    RegisterForm vista;

    public RegisterControl(WSOperaciones cliente, RegisterForm vista) {
        this.cliente = cliente;
        this.vista = vista;

        vista.getContentPane().setBackground(new Color(255, 255, 255));
        vista.setVisible(true);
        vista.setResizable(false);
        vista.setTitle("Registro");
        vista.setLocationRelativeTo(null);

    }

    private void goToLogin() {
        LoginControl loginControl = new LoginControl(cliente, new LoginForm());
        loginControl.listeners();
        vista.dispose();
    }

    private void register() {

        String username = vista.getTxt_username().getText();
        String password = String.valueOf(vista.getTxt_password().getPassword());
        String confirmPassword = String.valueOf(vista.getTxt_confirmpass().getPassword());
        String saldoText = vista.getTxt_saldo().getText();

        if (!username.isEmpty() && !password.isEmpty() && !confirmPassword.isEmpty()) {

            if (comparePasswords()) {
                if (validUsername(username)) {

                    double saldo = 0.0;
                    if (!saldoText.trim().isEmpty() && Double.parseDouble(saldoText.trim()) > 0) {

                        saldo = Double.parseDouble(saldoText);
                    }

                    cliente.register(username, password, saldo);
                    JOptionPane.showMessageDialog(vista, htmlMessage("Usuario registrado con éxito"), "Mensaje", 1);
                    goToLogin();

                } else {
                    JOptionPane.showMessageDialog(vista, htmlMessage("Nombre de usuario no disponible"), "Precaución", 0);
                }
            } else {
                JOptionPane.showMessageDialog(vista, htmlMessage("Revise las contraseñas"), "Advertencia", 2);
            }

        } else {
            JOptionPane.showMessageDialog(vista, htmlMessage("Completar los campos requeridos"), "Advertencia", 2);
        }
    }

    @Override
    public void listeners() {

        vista.getJlreturn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                goToLogin();
            }

        });

        vista.getBtn_register().addActionListener(l -> register());

        vista.getTxt_password().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                comparePasswords();
            }

        });

        vista.getTxt_confirmpass().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                comparePasswords();
            }

        });

    }

    private boolean validUsername(String username) {

        return cliente.getAllData().stream().noneMatch(p -> p.getUsuario().equals(username));
    }

    private boolean comparePasswords() {

        String password = String.valueOf(vista.getTxt_password().getPassword());
        String confirm_password = String.valueOf(vista.getTxt_confirmpass().getPassword());

        if (!password.isEmpty()) {

            if (confirm_password.equals(password)) {
                vista.getTxt_confirmpass().setBorder(new LineBorder(Color.decode("#87EA95"), 2));

                return true;
            } else {
                vista.getTxt_confirmpass().setBorder(new LineBorder(Color.decode("#EAA987"), 2));
                return false;
            }

        } else {
            vista.getTxt_confirmpass().setBorder(new LineBorder(Color.decode("#EAA987"), 2));
            return false;
        }
    }

    private String htmlMessage(String text) {

        return "<html><h3 style='font-family: 'Trebuchet MS'; font-weight:bold;'>" + text + "</h3></html>";
    }

}
