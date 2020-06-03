//hecho por Noemi Resendiz 
//este codigo es de la clase forma de pago el cual esta heredado de comprar
package Clases;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Karen Cruz
 */
public class Forma_de_pago extends Compra{
 protected int desiciondepago;//declaramos la variable a utilzar en switch
  protected int credito,debito;  
    public Forma_de_pago(String nombre, int ID, String Apellido, String Direccion, String Sexo, String Correo, int Telefono) {
        super(nombre, ID, Apellido, Direccion, Sexo, Correo, Telefono);
    }
      
    private void funciones(){
        // dato de pago es la variable a leer para la decision de pago 
   Scanner datodepago =new Scanner(System.in);//se imprimn las opciones de pgo el cual seran valores enteros
        System.out.println("Elija una opción de pago");
        System.out.println("1---- Tarjeta de credito oDebito "); 
        System.out.println("2---- Pay pal ");
        System.out.println("3---- Deposiyo Bancario "); 
        desiciondepago=datodepago.nextInt(); //recibira un valor entero
        
        switch (desiciondepago){
            case 1 :   
   //este método confirma datos de la forma de pago
     System.out.println(" Tarjeta de credito oDebito "); 
     
       break;
        case 2: 
  //este método confirma datos de la forma de pago por paypal
 System.out.println(" Pago de paypal "); 
        break;
        case 3:          
 //este método confirma datos de la forma de pago por Deposito Bancario
   System.out.println("Deposito Bancario "); 
       break;
     //limitamos a que elija otro numero
        default :  System.out.println(" no existe esa opción"); 
     
}
  
}





}
