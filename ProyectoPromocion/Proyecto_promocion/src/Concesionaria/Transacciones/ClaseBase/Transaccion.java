package Concesionaria.Transacciones.ClaseBase;

import java.time.LocalDateTime;
import Concesionaria.Vehiculos.ClaseBase.Vehiculo;
import Concesionaria.Persona.SubClases.Cliente;

public abstract class Transaccion {

    /* --------------------------------- */
    /* Atributos de la clase Transaccion */
    /* --------------------------------- */

    private Vehiculo vehiculo;
    private Cliente cliente;
    private double monto;
    private  LocalDateTime fecha;

    /* -------------------------- */
    /* Constructor sin argumentos */
    /* -------------------------- */

    public Transaccion() {
    }

    /* -------------------------- */
    /* Constructor con argumentos */
    /* -------------------------- */


    public Transaccion(Vehiculo vehiculo, Cliente cliente, double monto, LocalDateTime fecha) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.monto = monto;
        this.fecha = fecha;
    }

    /* ------- */
    /* Getters */
    /* ------- */


    public Vehiculo getVehiculo() {
        return vehiculo;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public double getMonto() {
        return monto;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }
    
    /* ------- */
    /* Setters */
    /* ------- */


    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void setMonto(double monto) {
        this.monto = monto;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    /* Método abstracto para obtener el tipo de transaccion que va a devolver "venta" o "compra" respectivamente de la sub-clase que sea */

    public abstract String getTipoTransaccion();


    /* Declaramos un método toString como abstracto para que las clases heredadas puedan personalizar la cadena de un objeto según sus propia reglas */

    public abstract String toString();
       
}
