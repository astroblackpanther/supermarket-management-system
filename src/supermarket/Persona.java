
package supermarket;

/**
 *
 * @author mpaul
 */
public class Persona {
    //Atributos de los clientes
    String nombre;
    String correo;
    String celular;
    String cedula;

    public Persona(String nombre, String correo, String celular, String cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }



    
    
    
}
