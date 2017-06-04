
package EntradaSalida;

public class ArchivoObjetoPersona implements java.io.Serializable{
    private String dni;
    private String nombre;
    private String apellido;
    
    public ArchivoObjetoPersona (String dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getAtributos(){
        return this.getDni() + " " + this.getApellido() + " " + this.getNombre();
    }
    
}
