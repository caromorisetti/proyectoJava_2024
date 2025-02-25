package Concesionaria.Persona.SubClases;


import Concesionaria.Persona.ClaseBase.*;

public class Cliente extends Persona {

    /* ----------------------------- */
    /* Atributos de la clase Cliente */
    /* ----------------------------- */

    private int n_Cliente;
    private static int idCont=0;
    
    /* -------------------------- */
    /* Constructor sin argumentos */
    /* -------------------------- */

    public Cliente() {
    }

    /* ---------------------------- */
    /* Constructores con argumentos */
    /* ---------------------------- */

    public Cliente(String nombre, String apellido, int dni, String contacto) {
        super(nombre, apellido, dni, contacto);
        this.n_Cliente = idCont++;
    }

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
        
    }

    /* ------ */
    /* Getter */
    /* ------ */

    public int getn_Cliente() {
        return n_Cliente;
    }

    /* ------- */
    /* Setter */
    /* ------ */

    public void setn_Cliente(int n_Cliente) {
        this.n_Cliente = n_Cliente;
    }

    /* ---------------------------------------------------- */
    /* Sobreescribimos el método toString de la clase padre */
    /* ---------------------------------------------------- */

    @Override
    public String toString() {
        return "N° Cliente= " + n_Cliente + "\n" +
        "Apellido y nombre: " + getApellido() + ", " + getNombre() + "\n" +
        "DNI= " + getDni() + "\n" +
        "Contacto= " + getContacto() + "\n";
        
    }
    
}
