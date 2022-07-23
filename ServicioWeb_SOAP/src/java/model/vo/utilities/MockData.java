
package model.vo.utilities;

import java.util.ArrayList;
import java.util.List;
import model.vo.UsuarioVo;

public class MockData {
    
    
    public static List<UsuarioVo> usersList;
    
    public static void fillList(){
        
        
        usersList = new ArrayList<>();
        
        usersList.add(new UsuarioVo(1,"admin", "1234", 1500.20));
        usersList.add(new UsuarioVo(2,"hugo", "1234", 425.10));
        usersList.add(new UsuarioVo(3,"gustavo", "1234", 789.00));
    }
    
    
}
