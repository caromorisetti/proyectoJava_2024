package Concesionaria.Vehiculos.SubClases;

import Concesionaria.Vehiculos.ClaseBase.Vehiculo;

public class Camioneta extends Vehiculo {

    /* ------------------------------ */
    /* Atributo de la clase Camioneta */
    /* ------------------------------ */

    private int capacidadCarga;

    /*----------------------------*/
    /* Constructor sin Argumentos */
    /*----------------------------*/

    public Camioneta(){
    }

    /*------------------------------*/
    /* Constructores con Argumentos */
    /*------------------------------*/

    public Camioneta(String patente, String marca, String modelo, String color, int año, int km, double precio,
            String estado, int capacidadCarga) {
        super(patente, marca, modelo, color, año, km, precio, estado);
        this.capacidadCarga=capacidadCarga;
        
    }

    public Camioneta(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }

    /* ------ */
    /* Getter */
    /* ------ */
    
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    /* ------ */
    /* Setter */
    /* ------ */
    
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /*-----------------------------------------*/
    /* Método que muestra los datos del Objeto */
    /*-----------------------------------------*/

    @Override
    public String toString() {
        return "Camioneta: " + "\n" +  
        super.toString() + "\n" +
        "Capacidad de carga: " + capacidadCarga + "\n";
    }

}
