package Concesionaria.Vehiculos.SubClases;

import Concesionaria.Vehiculos.ClaseBase.Vehiculo;

public class Automovil extends Vehiculo {

    /* ----------------------------- */
    /* Atributo de la clase Vehículo */
    /* ----------------------------- */

    private int cantPuertas;

    /*----------------------------*/
    /* Constructor sin Argumentos */
    /*----------------------------*/

    public Automovil() {
    }
    
    /*------------------------------*/
    /* Constructores con Argumentos */
    /*------------------------------*/

    public Automovil (String patente, String marca, String modelo, String color, int año, int km, double precio, String estado, int cantPuertas) {
        super(patente, marca, modelo, color, año, km,  precio, estado);
        this.cantPuertas = cantPuertas;
    }

    public Automovil(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }

    /* ------ */
    /* Getter */
    /* ------ */

    public int getCantPuertas() {
        return cantPuertas;
    }

    /* ------ */
    /* Setter */
    /* ------ */

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    /*-----------------------------------------*/
    /* Método que muestra los datos del Objeto */
    /*-----------------------------------------*/

    @Override
    public String toString() {
        return "Auto: " + "\n" + 
        super.toString() + "\n" +
        "Cantidad de puertas: " + cantPuertas + "\n";
    }
}
