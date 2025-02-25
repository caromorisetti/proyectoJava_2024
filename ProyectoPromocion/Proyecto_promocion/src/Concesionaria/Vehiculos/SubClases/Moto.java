package Concesionaria.Vehiculos.SubClases;

import Concesionaria.Vehiculos.ClaseBase.Vehiculo;

public class Moto extends Vehiculo {

   /* ------------------------- */
   /* Atributo de la clase Moto */
   /* ------------------------- */

   int cilindrada;

   /*----------------------------*/
   /* Constructor sin Argumentos */
   /*----------------------------*/
    
   public Moto() {
   }

   /*------------------------------*/
   /* Constructores con Argumentos */
   /*------------------------------*/

   public Moto(String patente, String marca, String modelo, String color, int año, int km, double precio,
         String estado, int cilindrada) {
      super(patente, marca, modelo, color, año, km, precio, estado);
      this.cilindrada = cilindrada;
   }

   public Moto(String marca, String modelo, String patente) {
      super(marca, modelo, patente);
   }

   /* ------ */
   /* Getter */
   /* ------ */

   public int getCilindrada() {
      return cilindrada;
   }

   /* ------ */
   /* Setter */
   /* ------ */

   public void setCilindrada(int cilindrada) {
      this.cilindrada = cilindrada;
   }
      
   /*-----------------------------------------*/
   /* Método que muestra los datos del Objeto */
   /*-----------------------------------------*/

   @Override
   public String toString() {
      return "Moto: " + "\n" +
      super.toString() + "\n" +
      "Cilindrada: " + cilindrada + "cc." + "\n";
   }
   
}
