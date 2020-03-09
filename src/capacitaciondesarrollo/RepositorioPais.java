
package capacitaciondesarrollo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositorioPais {
    ConexionBD con = new ConexionBD();
    public List mostrarTodo(){
        List lista= new ArrayList();
        try{
            con.Conectar();
            PreparedStatement ps = con.c.prepareStatement("SELECT * FROM Pais;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("idPais");
                String nombre = rs.getString("Nombre");
                String codigoP = rs.getString("codigopostal");
                
                Pais p = new Pais (id,nombre,codigoP);
                lista.add(p);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            con.cerrarConexion();
        }
        return lista;
    }
}
