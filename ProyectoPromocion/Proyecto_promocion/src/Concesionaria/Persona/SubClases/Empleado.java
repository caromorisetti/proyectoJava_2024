package Concesionaria.Persona.SubClases;

import Concesionaria.Persona.ClaseBase.Persona;

public class Empleado extends Persona {

    /* ------------------------------ */
    /* Atributos de la clase Empleado */
    /* ------------------------------ */

    private int idEmpleado;
    private String cargo;
    private static int idContador=0;

    /* -------------------------- */
    /* Constructor sin argumentos */
    /* -------------------------- */

    public Empleado() {
    }

    /* ---------------------------- */
    /* Constructores con argumentos */
    /* ---------------------------- */

    public Empleado(String nombre, String apellido, int dni, String contacto, String cargo) {
        super(nombre, apellido, dni, contacto);
        this.idEmpleado = idContador++;
        this.cargo = cargo;
    }

    public Empleado(String cargo, String nombre, String apellido){
        super(nombre, apellido);
        this.cargo=cargo;
    }

    /* ------- */
    /* Getters */
    /* ------- */

    public int getidEmpleado() {
        return idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    /* ------- */
    /* Setters */
    /* ------- */

    public void setidEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /* ---------------------------------------------------- */
    /* Sobreescribimos el método toString de la clase padre */
    /* ---------------------------------------------------- */

    @Override
    public String toString() {
        return "Id Empleado: " + idEmpleado + "\n" +
        "Cargo: " + cargo + "\n" +
        "Apellido y nombre: " + getApellido() + ", " + getNombre() + "\n" +
        "DNI=" + getDni() + "\n";
    }
  
}
