
package ws;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.vo.UsuarioVo;
import model.vo.utilities.MockData;

/**
 *
 * @author Fausto
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "loadData")
    public void loadData() {

        MockData.fillList();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public Integer login(@WebParam(name = "user") String user, @WebParam(name = "password") String password) {

        Optional<UsuarioVo> userOpt = MockData.usersList.stream().filter(u -> u.getUsuario().equals(user) && u.getPassword().equals(password)).findFirst();

        if (userOpt.isPresent()) {

            UsuarioVo usuario = userOpt.get();

            return usuario.getId_usuario();

        } else {
            return 0;
        }

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "procesarPago")
    public Double procesarPago(@WebParam(name = "total") double total, @WebParam(name = "pago") double pago) {

        if (pago >= total) {

            return pago - total;
        } else {
            return -1.0;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "register")
    @Oneway
    public void register(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "saldo") double saldo) {

        int idMax = MockData.usersList.get(MockData.usersList.size() - 1).getId_usuario();
        MockData.usersList.add(new UsuarioVo(idMax + 1, username, password, saldo));

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getDataByUser")
    public UsuarioVo getDataByUser(@WebParam(name = "id_user") int id_user) {

        Optional<UsuarioVo> user = MockData.usersList.stream().filter(p -> p.getId_usuario() == id_user).findAny();
        return user.get();

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "doTransaction")
    public String doTransaction(@WebParam(name = "id_usuario") int id_usuario, @WebParam(name = "operation") String operation, @WebParam(name = "saldo") double saldo, @WebParam(name = "valor") double valor) {

        String mensaje = "";

        if (valor != 0 && !String.valueOf(valor).startsWith("-")) {
            switch (operation) {

                case "Depósito":

                    setNewSaldo(id_usuario, saldo + valor);
                    
                    mensaje = "Depósito realizado con éxito";
                    break;

                case "Retiro":

                    if (saldo >= valor) {
                        setNewSaldo(id_usuario, saldo - valor);
                        mensaje = "Retiro realizado con éxito";
                    } else {
                        mensaje = "Saldo insuficiente";
                    }

                    break;
            }
        } else {
            mensaje = "Ingrese un valor mayor a 0 ";
        }

        return mensaje;
    }

    public void setNewSaldo(int id_usuario, double nuevoSaldo) {

        for (int i = 0; i < MockData.usersList.size(); i++) {

            if (MockData.usersList.get(i).getId_usuario() == id_usuario) {
                
                double roundNuevoSaldo = Math.round(nuevoSaldo * 100.0)/100.0;
                MockData.usersList.get(i).setSaldo(roundNuevoSaldo);
            }
        }

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllData")
    public List<UsuarioVo> getAllData() {
        return MockData.usersList;
    }

}
