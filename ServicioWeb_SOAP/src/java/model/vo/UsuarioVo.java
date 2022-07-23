
package model.vo;


public class UsuarioVo {
    
    private int id_usuario;
    private String usuario;
    private String password;
    private double saldo;

    public UsuarioVo(int id_usuario, String usuario, String password, double saldo) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.password = password;
        this.saldo = saldo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    
    
}
