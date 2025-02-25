package Concesionaria.Persona.ClaseBase;


public class Persona {

    /* ----------------------------- */
    /* Atributos de la clase Persona */
    /* ----------------------------- */
        
    private String nombre;
    private String apellido;
    private int dni;
    private String contacto;

    /* -------------------------- */
    /* Constructor sin argumentos */
    /* -------------------------- */


    public Persona() {
    }

    /* ---------------------------- */
    /* Constructores con argumentos */
    /* ---------------------------- */


    public Persona(String nombre, String apellido, int dni, String contacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.contacto = contacto;
    }

    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    /* ------- */
    /* Getters */
    /* ------- */


    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public int getDni() {
        return dni;
    }


    public String getContacto() {
        return contacto;
    }

    /* ------- */
    /* Setters */
    /* ------- */


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setDni(int dni) {
        this.dni = dni;
    }


    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /* ---------------------------------------------------------------------------- */
    /* Método toString para obetener en forma de cadena la información de un objeto */
    /* ---------------------------------------------------------------------------- */

    public String toString() {
        return "Apellido y nombre: " + apellido + ", " + nombre + "\n" +
        "DNI: " + dni + "\n" + 
        "Contacto: " + contacto;
    }
    
}
