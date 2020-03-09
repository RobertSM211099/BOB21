
package capacitaciondesarrollo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    private String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
    private String user = "root";
    private String password = "root";
    Connection c;
    public void Conectar(){
        try{
//            Class.forName("com.sql.jdbc.Driver");
             c= DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Conexion inexitosa por coronavirus");
        }
    
    }
    
    public void cerrarConexion (){
        try{
        c.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
