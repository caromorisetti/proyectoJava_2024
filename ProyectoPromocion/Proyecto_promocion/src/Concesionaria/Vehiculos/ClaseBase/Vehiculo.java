package Concesionaria.Vehiculos.ClaseBase;

public class Vehiculo {

    /* ------------------------------ */
    /* Atributos de la clase Vehiculo */
    /* ------------------------------ */

    private int idVehiculos;
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private int km;
    private double precio;
    private String estado;
    private static int idContVeh=0;

   /*----------------------------*/
   /* Constructor sin Argumentos */
   /*----------------------------*/

    public Vehiculo() {
        this.patente="";
        this.marca="";
        this.modelo="";
        this.color="";
        this.anio=0;
        this.km=0;
        this.precio=0.0;
        this.estado="";

    }

    /*------------------------------*/
    /* Constructores con Argumentos */
    /*------------------------------*/

    public Vehiculo(String patente, String marca, String modelo, String color, int anio, int km, double precio, String estado) {
        this.idVehiculos=idContVeh++;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.km=km;
        this.precio = precio;
        this.estado=estado;
       
    }

    public Vehiculo(String marca, String modelo, String patente){
        this.marca=marca;
        this.modelo=modelo;
        this.patente=patente;
    }

    /*----------------------------------------------------*/
    /* Método que permiten retornar los datos del Objeto */
    /*----------------------------------------------------*/

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getPatente() {
        return patente;
    }
    
    public String getModelo() {
        return modelo;
    }

    public int getAnio(){
        return anio;
    }

    public String getEstado(){
        return estado;
    }

    public int getKm(){
        return km;
    }

    public int getIdVehiculos(){
        return idVehiculos;
    }

    /*----------------------------------------------------*/
    /* Método que permiten setear los datos del Objeto */
    /*----------------------------------------------------*/

    public void setColor(String color) {
        this.color = color;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int anio){
        this.anio=anio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

    public void setKm(int km){
        this.km=km;
    }

    /*-----------------------------------------*/
    /* Método que muestra los datos del Objeto */
    /*-----------------------------------------*/

    public String toString() {
        return "Id: " + idVehiculos + "\n" +
        "Patente: " + patente + "\n" +
        "Marca:  " + marca + " - Modelo:  " + modelo + "\n" +
        "Color: "+ color + "\n" +
        "Año: " + anio + "\n" +
        "km: " + km + "\n" +
        "Precio: " + precio + "$" + "\n" +
        "Estado: " + estado;
    }

}
