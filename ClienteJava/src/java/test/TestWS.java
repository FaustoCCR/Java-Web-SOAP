package test;

import controlador.LoginControl;
import view.LoginForm;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

public class TestWS {

    public static void main(String[] args) {

        //crear el servicio
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort(); // cliente

        //loading the information
        cliente.loadData();

        //metodos
        LoginControl loginControl = new LoginControl(cliente, new LoginForm());
        loginControl.listeners();

    }
}
