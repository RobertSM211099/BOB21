
package capacitaciondesarrollo;

import java.util.List;

public class CapacitacionDesarrollo {

    public static void main(String[] args) {
        ConexionBD con = new ConexionBD();
        RepositorioPais pr = new RepositorioPais();
//        pr.mostrarTodo();
        List lista = pr.mostrarTodo();
        System.out.println(lista);
//        con.Conectar();
    }
}
