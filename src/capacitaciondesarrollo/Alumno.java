
package capacitaciondesarrollo;

public class Alumno {
    private String nombre;
    private int edad;
    private int nota;

    public Alumno(String nombre, int edad, int nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    
    public String getNombre() {
        return "el nombre es "+nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad <18){
            System.out.println("Mayor de edad");
        }else {
            System.out.println("Menor de edad");
        }
        this.edad = edad;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
