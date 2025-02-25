package Concesionaria.Transacciones.SubClases;

import java.time.LocalDateTime;
import Concesionaria.Persona.SubClases.Cliente;
import Concesionaria.Transacciones.ClaseBase.Transaccion;
import Concesionaria.Vehiculos.ClaseBase.Vehiculo;

public class Compra extends Transaccion {

    /* -------------------------- */
    /* Constructor sin argumentos */
    /* -------------------------- */

    public Compra() {
    }
    
    /* -------------------------- */
    /* Constructor con argumentos */
    /* -------------------------- */

    public Compra(Vehiculo vehiculo, Cliente cliente, LocalDateTime fecha, double monto){
        super(vehiculo, cliente, monto, fecha);

    }

    /* Sobreescribo el método getTipoTransaccion() de la clase base para que me devuelva en esta sub clase "Compra" */

    @Override
    public String getTipoTransaccion(){
        return "Compra";
    }

    /* Sobreescribo el método toString() de la clase padre para que me devuelva en forma de cadena de un objeto, 
    detalles relevantes sobre la transacción del tipo compra */

    @Override
    public String toString() {
        return " Tipo: " + getTipoTransaccion() + "\n" + 
        "Cliente: " + getCliente().getNombre() + " " + getCliente().getApellido() + " (ID: " + getCliente().getn_Cliente() + ")" + "\n" + 
        "Vehículo: " + getVehiculo().getMarca() + getVehiculo().getModelo()+ " (Patente: " + getVehiculo().getPatente() + ")" + "\n" +
        "Valor: " + getMonto() + "$" + "\n";
    }
    
}
