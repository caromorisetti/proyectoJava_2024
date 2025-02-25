package Concesionaria;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import Concesionaria.Persona.SubClases.*;
import Concesionaria.Transacciones.SubClases.*;
import Concesionaria.Vehiculos.ClaseBase.Vehiculo;
import Concesionaria.Vehiculos.SubClases.*;


public class Main {

    /*------------------*/
    /* Menú de opciones */
    /*------------------*/
    
    public static void mostrarMenu() { 

        System.out.println("║--------------------------║");
        System.out.println("║ --- Menú de Opciones --- ║");
        System.out.println("║--------------------------║");
        System.out.println("");
        System.out.println("--> Opción 1: Cargar Datos ");
        System.out.println("--> Opción 2: Mostrar Datos");
        System.out.println("--> Opción 3: Búsqueda por marca (Lineal)");
        System.out.println("--> Opción 4: Búsqueda por patente (Binaria)");
        System.out.println("--> Opcion 5: Ordenar por año del vehículo");
        System.out.println("--> Opción 6: Ordenar por precio (Ordenamiento por Inserción)");
        System.out.println("--> Opcion 7: Cambiar estado del vehículo");
        System.out.println("--> Opción 8: Consultas personalizadas");
        System.out.println("--> Opción 0: Salir");
      
    }

    /*----------------------*/
    /* Menú de transacciones */
    /*-----------------------*/

    public static void mostrarMenuTransaccion() {
        
        System.out.println("║---------------------------║");
        System.out.println("║ --- Elija transacción --- ║");
        System.out.println("║---------------------------║");
        System.out.println("");
        System.out.println("   Opción 1. COMPRA  ");
        System.out.println("   Opción 2. VENTA   ");
        System.out.println("   Opción 0: Salir   ");
      
    }
    /*-------------------*/
    /* Menú de Vehículos */
    /*-------------------*/
    
    public static void mostrarMenuVehiculo() {
        
        System.out.println("║--------------------------------║");
        System.out.println("║ --- Elija tipo de vehículo --- ║");
        System.out.println("║--------------------------------║");
        System.out.println("");
        System.out.println("   Opción 1. Automóvil  ");
        System.out.println("   Opción 2. Moto   ");
        System.out.println("   Opción 3: Camioneta   ");
        System.out.println("   Opción 0: Salir   ");
      
    }

    /*----------------------------------*/
    /* Menú de consultas personalizadas */
    /*----------------------------------*/

    public static void mostrarMenuConsultas(){
        System.out.println("║----------------------------------║");
        System.out.println("║ --- Consultas personalizadas --- ║");
        System.out.println("║----------------------------------║");
        System.out.println("");
        System.out.println("Opción 1: Vehículos por tipo");
        System.out.println("Opción 2: Vehículos vendidos en el año ingresado");
        System.out.println("Opción 0: Volver al menú principal");
        System.out.println("");
    }

    /*---------------------------------*/
    /* METODO PARA LIMPIAR LA TERMINAL */
    /*---------------------------------*/

    public static void limpiar(Scanner data) throws InterruptedException, IOException {
        System.out.print("\nPresione enter para continuar...");
        data.nextLine();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner data = new Scanner(System.in);

        /* ---------------------------------------------------------------------------------- */
        /* EJEMPLOS PARA CARGAR DATOS MANUALMENTE, GENERANDO OBJETOS Y MOSTRANDO POR PANTALLA */
        /* ---------------------------------------------------------------------------------- */

        //Establecemos capacidades máximas para el ingreso de vehiculos, clientes, empleados y transacciones realizadas
        /*    int maxVehiculos=100;
        int maxClientes=100;
        int maxEmpleados=50;
        int maxTransacciones=200;

        //Crear una instancia de la clase Concesionaria con los valores que se establecieron como máximas

        ConcesionariaSuc concesionaria1=new ConcesionariaSuc(maxVehiculos, maxEmpleados, maxClientes, maxTransacciones);

        //Agregar vehículos
        concesionaria1.agregarVehiculo(new Automovil(1, "OLP-982", "Citroen", "Berlingo", "Gris", 2015, 107500, 7500000, "Usado", 5));
        concesionaria1.agregarVehiculo(new Moto(10, "A-123-YEV", "Zanella", "ZB", "Gris", 2018, 2900, 349800, "Usado", 110));

        //Agregar empleados
        concesionaria1.agregarEmpleado(new Empleado("Roberto", "Lopez", 16998356, "robertolopez@gmail.com", 30, "Gerente"));
        concesionaria1.agregarEmpleado(new Empleado("Natalia", "Contreras", 28965439, "2916456389", 15, "Vendedor"));

        //Agregar clientes
        concesionaria1.agregarCliente(new Cliente("Patricia", "Garcia", 30987645, "2915765893", 88));
        concesionaria1.agregarCliente(new Cliente("Luciano", "Irigoyen", 31098764, "lucianoiri@gmail.com", 50));

        //Agregar transacciones
        concesionaria1.agregarTransaccion(new Venta(new Automovil(2, "Fiat", "Uno","TEI-987"), new Cliente(46, "Nadia", "Linares"), 1500000, new Date(), new Empleado(30, "Vendedor", "Lucía", "Rodríguez")));


        //Mostrar la información
        concesionaria1.mostrarInventario();
        System.out.println("-----------------------------------");
        concesionaria1.mostrarEmpleados();
        System.out.println("-----------------------------------");
        concesionaria1.mostrarClientes();
        System.out.println("-----------------------------------");
        concesionaria1.mostrarTransacciones();

        /* ------------------------------------------------------------------------------------------------------------------------------- */
        /* ------------------------------------------------------------------------------------------------------------------------------- */

        //Le pido al usuario que ingrese las capacidades máximas que se permitiran ingresar para vehiculos, empleados y clientes

        System.out.println("Ingrese la capacidad máxima de vehículos: ");
        int maxVehiculos=data.nextInt();

        System.out.println("Ingrese la capacidad máxima de empleados: ");
        int maxEmpleados=data.nextInt();

        System.out.println("Ingrese la capacidad máxima de clientes: ");
        int maxClientes=data.nextInt();

        System.out.println("Ingrese la cantidad máxima de transacciones: ");
        int maxTransacciones=data.nextInt();
        
        //Crear una instancia de la clase ConcesionariaSuc con los valores ingresados

        ConcesionariaSuc concesionaria1 = new ConcesionariaSuc(maxVehiculos, maxEmpleados, maxClientes, maxTransacciones);
        
        int opcion;
        do {
            mostrarMenu();
            System.out.println("\n\tIngrese la opción: ");
            opcion=data.nextInt();
            data.nextLine();
            System.out.println(" ------ ------ ");
            System.out.println("  ");
            switch (opcion) {
                case 1:
                    //Cargar datos
                    int subOpcion;
                    do {
                        System.out.println("Seleccione el tipo de datos a cargar: ");
                        System.out.println("");
                        System.out.println("1. Empleados");
                        System.out.println("2. Clientes");
                        System.out.println("3. Vehículos");
                        System.out.println("4. Transacciones");
                        System.out.println("0. Volver al menú principal");
                        System.out.println("");
                        System.out.println("Ingrese su opción: ");
                        subOpcion=data.nextInt();
                        data.nextLine();
                        switch (subOpcion) {
                            case 1:
                            
                                //Cargar datos de empleados
                                System.out.println(" -------------- ");
                                System.out.println(" -- Empleado -- ");
                                System.out.println(" -------------- ");
                                
                                System.out.println("Ingrese nombre: ");
                                String nombreEmp= data.nextLine();
                                System.out.println("Ingrese apellido: ");
                                String apellidoEmp=data.nextLine();
                                int dniEmp =0;  
                                System.out.println("Ingrese DNI: "); 
                                while(true) {
                                    try {
                                        dniEmp=data.nextInt();
                                        break;
                                    }   catch (InputMismatchException ime) {
                                            System.out.println("--> Error. Ingrese un número válido <--");
                                            data.nextLine(); 
                                        }    
                                }
                                data.nextLine();
                                System.out.println("Ingrese alguna forma de contacto: ");
                                String contactoEmp=data.nextLine();
                                System.out.println("Ingrese cargo: ");
                                String cargoEmp=data.nextLine();
                                System.out.println("");

                                //Creamos un objeto de la clase Empleado y le pasamos los parámetros agregados anteriormente por teclado
                               
                                Empleado empleado = new Empleado(nombreEmp, apellidoEmp, dniEmp, contactoEmp, cargoEmp);

                                //Agregamos la instancia creada de la clase Empleado al objeto creado Concesionaria1 (instancia de ConcesionariaSuc) utilizando el método agregarEmpleado
                                concesionaria1.agregarEmpleado(empleado);
       
                                break;
                            case 2:
                                //Cargar datos de clientes
                                System.out.println(" ------------- ");
                                System.out.println(" -- Cliente -- ");
                                System.out.println(" ------------- ");
                                
                                System.out.println("Ingrese nombre del cliente: ");
                                String nombreCli=data.nextLine();
                                System.out.println("Ingrese apellido: ");
                                String apellidoCli=data.nextLine(); 
                                System.out.println("Ingrese DNI: ");
                                int dniCli =0; 
                                while(true) {
                                    try {
                                        dniCli=data.nextInt();
                                        break;
                                    }   catch (InputMismatchException ime) {
                                            System.out.println("--> Error. Ingrese un número válido <--");
                                            data.nextLine(); 
                                        }    
                                }
                                data.nextLine();
                                System.out.println("Ingrese alguna forma de contacto: ");
                                String contactoCli=data.nextLine();

                                //Creamos un objeto de la clase Cliente y le pasamos los parámetros agregados anteriormente por teclado
                             
                                Cliente cliente=new Cliente(nombreCli, apellidoCli, dniCli, contactoCli);

                                //Agregamos la instancia creada de la clase Cliente al objeto creado Concesionaria1 (instancia de ConcesionariaSuc) utilizando el método agregarCliente
                                
                                concesionaria1.agregarCliente(cliente);

                                break;

                            case 3:
                                //Cargar datos de vehículos
                                System.out.println("");
                                mostrarMenuVehiculo();
                                System.out.println("");
                                System.out.println("Ingrese su opción: ");
                                int tipoVehiculo=data.nextInt();
                                data.nextLine();
                                switch (tipoVehiculo) {
                                    case 1:
                                        System.out.println(" --------------- ");
                                        System.out.println(" -- Automóvil -- ");
                                        System.out.println(" --------------- ");
                    
                                        System.out.println("Ingrese marca del automóvil: ");
                                        String marcaAuto = data.nextLine();
                                        System.out.println("Ingrese modelo del automóvil: ");
                                        String modeloAuto = data.nextLine();
                                        System.out.println("Ingrese color del automóvil: ");
                                        String colorAuto=data.nextLine();
                                        System.out.println("Ingrese año: ");
                                        int anioAuto;
                                        while(true) {
                                            try {
                                                anioAuto=data.nextInt();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine();   
                                                }
                                        }   
                                        data.nextLine();
                                        System.out.println("Ingrese kilometraje: ");
                                        int kmAuto;
                                        while (true) {
                                            try {
                                                kmAuto=data.nextInt();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                } 
                                        }
                                        data.nextLine();
                                        System.out.println("Ingrese precio del automóvil: ");
                                        double precioAuto;
                                        while (true) {
                                            try {
                                                precioAuto=data.nextDouble();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                } 
                                        }
                                        data.nextLine(); 
                                        System.out.println("Ingrese patente del automóvil: ");
                                        String patenteAuto = data.nextLine();
                                        System.out.println("Ingrese estado (DISPONIBLE/SEÑADO/VENDIDO): ");
                                        String estadoAuto=data.nextLine();
                                        System.out.println("Ingrese número de puertas del automóvil: ");
                                        int puertasAuto;
                                        while (true) {
                                            try {
                                                puertasAuto=data.nextInt();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                } 
                                        }
                                        data.nextLine(); 

                                        Automovil auto=new Automovil(patenteAuto, marcaAuto, modeloAuto, colorAuto, anioAuto, kmAuto, precioAuto, estadoAuto, puertasAuto);
                                        concesionaria1.agregarVehiculo(auto);
                  
                                        break;

                                    case 2:
                                        System.out.println(" ---------- ");
                                        System.out.println(" -- Moto -- ");
                                        System.out.println(" ---------- ");
                                        
                                        System.out.println("Ingrese marca de la moto: ");
                                        String marcaMoto = data.nextLine();
                                        System.out.println("Ingrese modelo de la moto: ");
                                        String modeloMoto = data.nextLine();
                                        System.out.println("Ingrese color de la moto: ");
                                        String colorMoto=data.nextLine();
                                        System.out.println("Ingrese año: ");
                                        int anioMoto;
                                        while (true) {
                                            try {
                                                anioMoto=data.nextInt();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                } 
                                        }
                                        data.nextLine();
                                        System.out.println("Ingrese kilometraje: ");
                                        int kmMoto;
                                        while (true) {  
                                            try {
                                                kmMoto=data.nextInt();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                } 
                                        }
                                        data.nextLine();
                                        System.out.println("Ingrese precio de la moto: ");
                                        double precioMoto;
                                        while (true) {
                                            try {
                                                precioMoto=data.nextDouble();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine();
                                            }    
                                        } 
                                        data.nextLine(); 
                                        System.out.println("Ingrese patente de la moto: ");
                                        String patenteMoto = data.nextLine();
                                        System.out.println("Ingrese estado de la moto (DISPONIBLE/SEÑADO/VENDIDO): ");
                                        String estadoMoto=data.nextLine();
                                        System.out.println("Ingrese cilindrada de la moto: ");
                                        int cilindradaMoto;
                                        while (true) {
                                            try {
                                                cilindradaMoto=data.nextInt();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                } 
                                        }
                                        data.nextLine(); 

                                        Moto moto=new Moto(patenteMoto, marcaMoto, modeloMoto, colorMoto, anioMoto, kmMoto, precioMoto, estadoMoto, cilindradaMoto);
                                        concesionaria1.agregarVehiculo(moto);

                                        break;

                                    case 3:
                                        System.out.println(" --------------- ");
                                        System.out.println(" -- Camioneta -- ");
                                        System.out.println(" --------------- ");
                                       
                                        System.out.println("Ingrese marca de la camioneta");
                                        String marcaCamio=data.nextLine();
                                        System.out.println("Ingrese modelo de la camioneta: ");
                                        String modeloCamio=data.nextLine();
                                        System.out.println("Ingrese patente: ");
                                        String patenteCamio=data.nextLine();
                                        System.out.println("Ingrese color de la camioneta: ");
                                        String colorCamioneta=data.nextLine();
                                        System.out.println("Ingrese año: ");
                                        int anioCamioneta;
                                        while (true) {
                                            try {
                                                anioCamioneta=data.nextInt();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                } 
                                        }
                                        data.nextLine();
                                        System.out.println("Ingrese kilometraje: ");
                                        int kmCamioneta;
                                        while (true) {
                                            try {
                                                kmCamioneta=data.nextInt();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                } 
                                        }
                                        data.nextLine();
                                        System.out.println("Ingrese precio: ");
                                        double precioCamioneta;
                                        while (true) {
                                            try {
                                                precioCamioneta=data.nextDouble();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                }
                                        }
                                        data.nextLine();
                                        System.out.println("Ingrese estado (DISPONIBLE/SEÑADO/VENDIDO): ");
                                        String estadoCamioneta=data.nextLine();
                                        System.out.println("Ingrese la capacidad de carga: ");
                                        int capCargaCamioneta;
                                        while (true) {
                                            try {
                                                capCargaCamioneta=data.nextInt();
                                                break;
                                            }   catch (InputMismatchException ime) {
                                                    System.out.println("--> Error. Ingrese un número válido <--");
                                                    data.nextLine(); 
                                                } 
                                        }
                                        data.nextLine();

                                        Camioneta camioneta=new Camioneta(patenteCamio, marcaCamio, modeloCamio, colorCamioneta, anioCamioneta, kmCamioneta, precioCamioneta, estadoCamioneta, capCargaCamioneta);
                                        concesionaria1.agregarVehiculo(camioneta);

                                        break;

                                    case 0:
                                        System.out.println(" -- Salir -- ");
                                        break;
                                
                                    default:
                                        System.out.println("Opción no válida.");
                                        break;
                                }

                                break;

                            case 4:

                                //Cargar transacciones

                                mostrarMenuTransaccion();
                                System.out.println("Ingrese su opción: ");
                                int tipoTransaccion=data.nextInt();
                                data.nextLine();
                                LocalDateTime fecha=LocalDateTime.now();

                                System.out.println("Seleccione un cliente: ");
                                System.out.println("");
                                concesionaria1.mostrarClientes();
                                int clienteIndice=data.nextInt();
                                data.nextLine();
                                Cliente clienteTransaccion = concesionaria1.clientes[clienteIndice];

                                System.out.println("Seleccione un vehículo: ");
                                System.out.println("");;
                                concesionaria1.mostrarInventario();
                                int vehiculoIndice=data.nextInt();
                                data.nextLine();
                                Vehiculo vehiculoTransaccion=concesionaria1.inventario[vehiculoIndice];

                                //Declaro una variable monto para obtener el precio del vehiculo y asignarselo

                                double monto=vehiculoTransaccion.getPrecio(); 

                                if (tipoTransaccion==1) {
                                    //Transacción compra
                                    Compra compra=new Compra(vehiculoTransaccion, clienteTransaccion, fecha, monto);
                                    concesionaria1.agregarTransaccion(compra);
                                    
                                } else if(tipoTransaccion==2){
                                    //Transacción venta
                                    System.out.println("Seleccione un vendedor: ");
                                    System.out.println("");
                                    concesionaria1.mostrarEmpleados();
                                    int empleadoIndice=data.nextInt();
                                    data.nextLine();
                                    Empleado empleadoTransaccion=concesionaria1.empleados[empleadoIndice];

                                    Venta venta=new Venta(vehiculoTransaccion, clienteTransaccion, monto, fecha, empleadoTransaccion);
                                    concesionaria1.agregarTransaccion(venta);
                                } else{
                                    System.out.println("Opción no válida.");
                                }


                                break;

                            case 0:
                                System.out.println("Volviendo al menú principal...");
                                break;
                        
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }

                        if (opcion!=0) {
                            limpiar(data);
                            
                        }   

                        
                    } while (subOpcion!=0);
                    
                    break;

                case 2:

                    //Mostrar datos 

                    System.out.println("Seleccione una opción de datos para mostrar:");
                    System.out.println("");
                    System.out.println("1. Mostrar Vehículos");
                    System.out.println("2. Mostrar Empleados");
                    System.out.println("3. Mostrar Clientes");
                    System.out.println("4. Mostrar Transacciones");
                    System.out.println("0. Volver al menú principal");
                    System.out.println("");
                    System.out.print("Ingrese su opción: ");
                    int mostrarOpcion = data.nextInt();
                    data.nextLine();

                    switch (mostrarOpcion) {
                        case 1:
                            System.out.println("");
                            concesionaria1.mostrarInventario();
                            
                            break;
                        case 2:
                            concesionaria1.mostrarEmpleados();
                            break;
                        case 3:
                            concesionaria1.mostrarClientes();
                            break;

                        case 4:
                            concesionaria1.mostrarTransacciones();
                            break;
                        case 0:
                            System.out.println("Volviendo al menú principal...");
                            break;
                    
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }

                    break;

                case 3:

                    //Búsqueda por marca (Lineal)

                    System.out.println("Ingrese la marca del vehículo que desea buscar: ");
                    System.out.println("");
                    String marcaBuscar=data.nextLine(); 
                    concesionaria1.buscaMarcaLineal(marcaBuscar);
                    break;

                case 4:

                    //Búsqueda por patente (Binaria)

                    System.out.println("Ingrese patente del vehículo que desea buscar: ");
                    System.out.println("");
                    String buscarPatente = data.nextLine();
                    System.out.println(" --- ");
                    concesionaria1.busquedaPatenteBinaria(buscarPatente);
                    
                    break;

                case 5:

                    //Ordenar por año del vehículo

                    concesionaria1.ordenarPorAnio();
                    System.out.println("Vehículos ordenados por año.");
                    System.out.println("");
                    concesionaria1.mostrarInventario();

                    break;

                case 6:

                    //Ordenar por precio

                    concesionaria1.ordenarPorPrecio();
                    System.out.println("Vehículos ordenados por precio (Ascendente).");
                    System.out.println(" ");
                    concesionaria1.mostrarInventario();

                    break; 

                case 7:

                    //Cambiar estado del vehículo

                    System.out.println("Seleccione un vehículo para cambiar el estado: ");
                    concesionaria1.mostrarInventario();
                    int vehiculoIndice=data.nextInt();
                    data.nextLine();
                    System.out.println("Ingrese el nuevo estado del vehículo: ");
                    String nuevoEstado=data.nextLine();
                    concesionaria1.cambiarEstadoVehiculo(vehiculoIndice, nuevoEstado);
                    
                    break;

                case 8:

                    //Consultas personalizadas

                    mostrarMenuConsultas();
                    System.out.println("Ingrese su opción: ");
                    int consultasOpcion=data.nextInt();
                    data.nextLine();
                    System.out.println("");
                    switch (consultasOpcion) {
                        case 1:

                            //Mostrar los vehículos por su tipo

                            System.out.println("Ingrese el tipo de vehículo (Automóvil/Moto/Camioneta): ");
                            String tipo=data.nextLine();
                            System.out.println("");
                            concesionaria1.mostrarVehiculosPorTipo(tipo);
                            
                            break;

                        case 2:

                            //Mostrar los vehículos vendidos en un año ingresado por teclado

                            System.out.println("Ingrese el año para ver los vehículos vendidos: ");
                            int anio=data.nextInt();
                            data.nextLine();
                            System.out.println("");
                            concesionaria1.mostrarVehiculosVendidosEnAnio(anio);

                            break;

                        case 0:
                            System.out.println("Volviendo al menú anterior...");

                            break;
                    
                        default:
                            System.out.println("Opción no válida.");

                            break;
                    }
                    break;

                default:
                System.out.println("Opción no válida.");

                break;

            }
            if (opcion!=0) {
                limpiar(data);
                
            }   
        } while (opcion !=0);
        
        data.close();
    }
}

