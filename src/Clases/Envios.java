//hecho por Noemi Resendiz 
//este codigo es de la clase envios el cual heredo datos de la clase comprar
package Clases;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Karen Cruz
 */
public class Envios extends Compra{
 protected String domicilio= "si";
    public Envios(String nombre, int ID, String Apellido, String Direccion, String Sexo, String Correo, int Telefono) {
        super(nombre, ID, Apellido, Direccion, Sexo, Correo, Telefono);
    }
    //este método confirma datos al usuario de su envio
  private void envio(){
      Scanner desicion_envio = new Scanner(System.in); //evaluamos la desion de envio
     System.out.println("Desea que la entrega sea a su domicilio");
      desicion_envio.next(domicilio);
      if(domicilio=="si"){
          System.out.println("su entrega ser a domicilio");//sera entregada a su domicilio sis la decision envio es si
          
      } else if (domicilio=="no"){
          System.out.println("su entrega sera en la susurcal de su eleccion");
      }else {
          System.out.println("no existe esa opción");
      }
      
      
      
      
  }
 
    
}
