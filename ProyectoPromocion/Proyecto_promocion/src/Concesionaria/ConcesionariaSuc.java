package Concesionaria;

import Concesionaria.Vehiculos.ClaseBase.Vehiculo;
import Concesionaria.Vehiculos.SubClases.*;
import Concesionaria.Persona.SubClases.*;
import Concesionaria.Transacciones.ClaseBase.Transaccion;
import Concesionaria.Transacciones.SubClases.Venta;

public class ConcesionariaSuc {

    /*----------------------------------------------------------------------------------------*/
    /* Arrays que almacenan los Vehiculos, Clientes, Empleados y las transacciones realizadas */
    /*----------------------------------------------------------------------------------------*/
    
    Vehiculo[] inventario;
    Empleado[] empleados;
    Cliente[] clientes;
    Transaccion[] transacciones;

    /*----------------------------------------------------------------*/
    /* Declaramos variables para contabilizar los diferentes listados */
    /*----------------------------------------------------------------*/

    private int inventarioCont;
    private int empleadosCont;
    private int clientesCont;
    private int transacionesCont;


    /*--------------------------------------------------------------------------------------------------------------------*/
    /* Constructor donde se pasa por parametros los maximos respectivos de empleados, clientes, vehiculos y transacciones */
    /*--------------------------------------------------------------------------------------------------------------------*/

    public ConcesionariaSuc(int maxVehiculos, int maxEmpleados, int maxClientes, int maxTransacciones){
        this.inventario=new Vehiculo[maxVehiculos];
        this.empleados=new Empleado[maxEmpleados];
        this.clientes=new Cliente[maxClientes];
        this.transacciones=new Transaccion[maxTransacciones];
        this.inventarioCont=0;
        this.empleadosCont=0;
        this.clientesCont=0;
        this.transacionesCont=0;
    }

    /*-------------------------------------------------------------------*/
    /* Método para agregar Vehiculos y sumarlos a una lista (inventario) */
    /*-------------------------------------------------------------------*/

    public void agregarVehiculo(Vehiculo vehiculo){
        if (inventarioCont < inventario.length) {
            inventario[inventarioCont++]= vehiculo;
            
        } else {
            System.out.println("No se puede agregar más vehículos, inventario lleno.");
        }
    }

    /*-------------------------------*/
    /* Método para agregar empleados */
    /*-------------------------------*/

    public void agregarEmpleado(Empleado empleado){
        if(empleadosCont<empleados.length){
            empleados[empleadosCont++]= empleado;
        } else{
            System.out.println("No se pueden agregar mas empleados. Lista llena.");
        }
    }

    /*------------------------------*/
    /* Método para agregar clientes */
    /*------------------------------*/

    public void agregarCliente(Cliente cliente){
        if (clientesCont < clientes.length) {
            clientes[clientesCont++]=cliente;
            
        } else{
            System.out.println("No se pueden agregar mas clientes. Lista llena.");
        }
    }

    /*-----------------------------------*/
    /* Método para agregar transacciones */
    /*-----------------------------------*/

    public void agregarTransaccion(Transaccion transaccion){
        if (transacionesCont<transacciones.length) {
            transacciones[transacionesCont++]=transaccion;
            
        } else{
            System.out.println("No se pueden agregar mas transacciones.Lista llena.");
        }
    }

    /*------------------------------------------------*/
    /* Método para mostrar el inventario de Vehiculos */
    /*------------------------------------------------*/

    public void mostrarInventario(){
        System.out.println("Inventario de vehículos: ");
        System.out.println("");
        for(int i=0; i<inventarioCont;i++){
            System.out.println(inventario[i]);
        }
    }

    /*-------------------------------------*/
    /* Método para mostrar a los empleados */
    /*-------------------------------------*/

    public void mostrarEmpleados(){
        System.out.println("Lista de empleados: ");
        System.out.println("");
        for(int i=0; i<empleadosCont;i++){
            System.out.println(empleados[i]);
        }
    }

    /*------------------------------------*/
    /* Método para mostrar a los clientes */
    /*------------------------------------*/

    public void mostrarClientes(){
        System.out.println("Lista de clientes: ");
        System.out.println("");
        for(int i=0; i<clientesCont;i++){
            System.out.println(clientes[i]);
        }
    }

    /*--------------------------------------------------*/
    /* Método para mostrar las transacciones realizadas */
    /*--------------------------------------------------*/
    
    public void mostrarTransacciones(){
        System.out.println("Lista de transacciones realizadas: ");
        System.out.println("");
        for(int i=0; i<transacionesCont;i++){
            System.out.println(transacciones[i]);
        }
    }

    /*-----------------------------------------------------  */
    /* METODO PARA BUSCAR SEGUN MARCA DEL VEHICULO (LINEAL) */
    /*-----------------------------------------------------  */

    public void buscaMarcaLineal(String marca){
        System.out.println("Resultados de la búsqueda de vehículos por marca " + marca + ": ");
        boolean encontrado=false;
        for(int i=0;i<inventarioCont;i++){
            if (inventario[i].getMarca().equalsIgnoreCase(marca)) { //Utilizo el equalsIgnoreCase para que al comparar el contenido de la cadena con otra, distinga mayusculas de minusculas
                System.out.println(i+". "+inventario[i]);
                encontrado=true;
                
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron vehículos de la marca '" + marca + "'. ");
            
        }

    }

    /*---------------------------------------------------*/
    /* MÉTODO PARA ORDENAR LAS PATENTES DE LOS VEHÍCULOS */
    /*---------------------------------------------------*/
    
    public void ordenarPorPatente(){
        for(int i=0; i<inventarioCont - 1; i++){
            for (int j=0; j<inventarioCont-i-1; j++){
                if (inventario[j].getPatente().compareTo(inventario[j+1].getPatente())>0) {
                    Vehiculo temp=inventario[j];
                    inventario[j]=inventario[j+1];
                    inventario[j+1]=temp;
                    
                }
            }
        }

    }

    /*------------------------------------------------------------ */
    /* METODO PARA BUSCAR SEGUN EL PATENTE DEL VEHÍCULO (BINARIA)  */
    /*------------------------------------------------------------ */

    public void busquedaPatenteBinaria(String buscarPatente) {
        ordenarPorPatente(); //Aseguramos que el inventario esté ordenado por patente

        int izquierda = 0;
        int derecha = inventarioCont - 1;
        boolean encontrado = false;
    
        while (izquierda <= derecha && !encontrado) {
            int central = (izquierda + derecha) / 2;
            String patenteMedia = inventario[central].getPatente();
            int resultado = buscarPatente.compareTo(patenteMedia);
    
            if (resultado == 0) {
                System.out.println(inventario[central]);
                encontrado = true;
            } else if (resultado < 0) {
                derecha = central - 1;
            } else {
                izquierda = central + 1;
            }
            
        } 
        if (!encontrado) {
            System.out.println("Vehículo con patente " + buscarPatente + " no encontrado.");
            
        }

    }

    /*-----------------------------------------------*/
    /* METODO PARA ORDENAR SEGUN EL AÑO DEL VEHÍCULO */
    /*-----------------------------------------------*/

    public void ordenarPorAnio(){
      boolean swapped;
      for(int i=0;i<inventario.length-1;i++){
        swapped=false;
        for(int j=0;j<inventario.length-1-i;j++){
            //Verificar que los elementos no sean nulos antes de acceder a los métodos

            if (inventario[j] != null && inventario[j + 1] != null) {
                if (inventario[j].getAnio() > inventario[j + 1].getAnio()) {
                Vehiculo aux=inventario[j];
                inventario[j]=inventario[j+1];
                inventario[j+1]=aux;
                swapped=true; 
                    
                }
                
            }
        }
        if (!swapped) {
            break;
            }
        }  
    }

    /*--------------------------------------------------*/
    /* METODO PARA ORDENAR SEGUN EL PRECIO DEL VEHÍCULO */
    /*--------------------------------------------------*/

    public void ordenarPorPrecio() {
       int pos;
        for(int i =0; i < inventario.length; i++) {
            if (inventario[i]==null) continue; //Con el continue saltamos los elementos null
                
            pos = i;
            double aux = inventario[i].getPrecio();
            Vehiculo auxVehiculo = inventario[i];
            while (pos > 0 && inventario[pos - 1] != null && inventario[pos - 1].getPrecio() > aux) {
                inventario[pos] = inventario[pos - 1];
                pos--;
            }
           inventario[pos] = auxVehiculo;
        }
    }

    /*-----------------------------------------*/
    /* METODO PARA CAMBIAR ESTADO DEL VEHICULO */
    /*-----------------------------------------*/

    public void cambiarEstadoVehiculo(int indice, String nuevoEstado){
        ordenarPorID();
        if (indice >= 0 && indice < inventarioCont && inventario[indice] != null) {
            inventario[indice].setEstado(nuevoEstado);
            System.out.println("Estado del vehículo actualizado a: " + nuevoEstado);
            
        } else{
            System.out.println("Índice de vehículo no válido.");
        }
    }

    /*---------------------------------------------*/
    /* METODO PARA MOSTRAR VEHICULOS SEGUN EL TIPO */
    /*---------------------------------------------*/

    public void mostrarVehiculosPorTipo(String tipo){
        ordenarPorID();
        System.out.println("Vehículos del tipo " + tipo + ": ");
        for(int i=0;i<inventarioCont;i++){
            if (tipo.equalsIgnoreCase("Automovil") && inventario[i] instanceof Automovil) {
                System.out.println(inventario[i]);
                
            } else if (tipo.equalsIgnoreCase("Moto") && inventario[i] instanceof Moto) {
                System.out.println(inventario[i]);
                
            } else if (tipo.equalsIgnoreCase("Camioneta") && inventario[i] instanceof Camioneta) {
                System.out.println(inventario[i]);
                
            }
        }
    }

    /*-------------------------------------------------------------  */
    /* METODO PARA MOSTRAR VEHICULOS VENDIDOS EN EL AÑO INGRESADO    */
    /*-------------------------------------------------------------  */

    public void mostrarVehiculosVendidosEnAnio(int anio){
        boolean ventasEncontradas=false;
        System.out.println("Vehículos vendidos en el año " + anio + ": ");
        System.out.println("");
        for(int i=0;i<transacciones.length;i++){
            if (transacciones[i] != null && transacciones[i] instanceof Venta) {
                Venta venta=(Venta) transacciones[i];
                if (venta.getFecha().getYear()==anio) {
                    System.out.println(venta.getVehiculo());
                    ventasEncontradas=true;      
                }   
            }
        }
        if (!ventasEncontradas) {
            System.out.println("No se encontraron ventas en el año " + anio + "."); 
        }
    }

    /*---------------------------------------------*/
    /* METODO PARA ORDENAR LOS VEHICULOS POR SU ID */
    /*---------------------------------------------*/

    public void ordenarPorID(){
        boolean swapped;
        for(int i=0; i<inventario.length-1; i++){
            swapped=false;
            for(int j=0; j<inventario.length-1-i; j++){
                if (inventario[j] != null && inventario[j + 1] != null && inventario[j].getIdVehiculos() > inventario[j + 1].getIdVehiculos()) {
                    Vehiculo aux=inventario[j];
                    inventario[j]=inventario[j+1];
                    inventario[j+1]=aux;
                    swapped=true;
                    
                }
            }

            if (!swapped) {
                break;
                
            }
        }
    }

}
