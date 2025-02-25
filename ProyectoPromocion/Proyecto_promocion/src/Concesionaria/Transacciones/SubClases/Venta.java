package Concesionaria.Transacciones.SubClases;

import java.time.LocalDateTime;
import Concesionaria.Vehiculos.ClaseBase.Vehiculo;
import Concesionaria.Persona.SubClases.*;
import Concesionaria.Transacciones.ClaseBase.Transaccion;

public class Venta extends Transaccion {

    /* -------------------------- */
    /* Atributo de la clase Venta */
    /* -------------------------- */

    private Empleado vendedor;

    /* -------------------------- */
    /* Constructor sin argumentos */
    /* -------------------------- */

    public Venta(){       
    }

    /* ---------------------------- */
    /* Constructores con argumentos */
    /* ---------------------------- */

    public Venta(Vehiculo vehiculo, Cliente cliente, double monto, LocalDateTime fecha, Empleado vendedor) {
        super(vehiculo, cliente, monto, fecha);
        this.vendedor = vendedor;
    }

    public Venta(Empleado vendedor){
        this.vendedor=vendedor;
    }
    
    /* ------ */
    /* Getter */
    /* ------ */

    public Empleado getVendedor() {
        return vendedor;
    }

    /* ------ */
    /* Setter */
    /* ------ */

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    /* Sobreescribo el método getTipoTransaccion() de la clase base para que me devuelva en esta sub clase "Venta" */

    @Override
    public String getTipoTransaccion(){
        return "Venta";
    }

    /* Sobreescribo el método toString() de la clase padre para que me devuelva en forma de cadena de un objeto, detalles relevantes sobre la transacción del tipo venta */

    @Override
    public String toString(){
        return "Tipo: " + getTipoTransaccion() + "\n" + 
        "Cliente: " + getCliente().getNombre() + " " + getCliente().getApellido() + " (ID: " + getCliente().getn_Cliente() + ")" + "\n" +
        "Vehiculo: " + getVehiculo().getMarca() + " (Patente: " + getVehiculo().getPatente() + ")" + "\n" +
        "Valor: " + getMonto() + "$" + "\n" +
        "Vendedor: " + getVendedor().getNombre() + " " + getVendedor().getApellido() + " (ID: " + getVendedor().getidEmpleado() + ")" + "\n";
    }

}
