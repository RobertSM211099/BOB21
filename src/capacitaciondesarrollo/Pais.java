
package capacitaciondesarrollo;
public class Pais {
    private int id;
    private String nombre;
    private String codigoPostal;

    public Pais(int id, String nombre, String codigoPostal) {
        this.id = id;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "\nPais {" + "id = " + id + ", nombre = " + nombre + ", codigoPostal = " + codigoPostal + '}';
    }
    
    
}
