/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Clases.Perfil;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Karen Cruz
 */
public class Administrador extends Perfil {
        private String nombre;
    private String apellido;
    private String direccion;
    private String rol;
    private String sexo;
    private String correo;
    private int tel;
    private int id;
    int opc;
    int art;
    int op;
    int od;
    int lo;    
      public Administrador (String us, int con,String nombre,String apellido,String direccion,String rol,String sexo,String correo,int tel,int id){
        super(us,con);
        this.nombre=this.nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.rol=rol;
        this.sexo=sexo;
        this.correo=correo;
        this.tel=this.tel;
        this.id=id; 
       
        
    }
         public void funcion() throws InterruptedException, IOException{
        Scanner teclado=new Scanner(System.in);
        System.out.println("MENU DE OPCIONES");
        System.out.println(" 1.Inventario");
        System.out.println("2.Usuario empleaado");
        System.out.println("3.Facturas genereadas");
        System.out.println("4. Salir");
        System.out.println("Dijite opcion");
        
        opc=teclado.nextInt();
        switch(opc){
            case 1: System.out.println("Inventario");
                   System.out.println("Desea realizar al un cambio");
                   System.out.println("MENU");
                   System.out.println("1.Editar inventario");
                   System.out.println("2.Modificaciones de ID");
                   System.out.println("3.salir");
                   System.out.println("Dijite opcion");
                   opc=teclado.nextInt();
                   switch(opc){
                       case 1:
                       System.out.println("Edicion de inventario MENU");  
                       System.out.println("1.Edicion de precio:");
                       System.out.println("2.Ver de caracteristicas");
                       System.out.println("3.Salir");
                       System.out.println("seleccione un opcion ");
                       op=teclado.nextInt();
                       switch(op){
                           case 1: 
                                System.out.println("1.Edicion de precio:");
                                System.out.println("Aritculo que desea editar: Falda negra 15454");
                                 System.out.println("Precio que desea modificar $269");
                                  System.out.println("Precio modificado $156");
                                  System.in.read();
                            break;
                           case 2:  
                               System.out.println("2.Edicion de caracteristicas");
                               System.out.println("Ingrese articulo que desea ver:");
                               System.out.println("Camisa cuadros beige ");
                           System.out.println("Color beige");
                           System.out.println("Patron Cuadros");
                           System.out.println("8 botones");
                            case 3:   
                             System.out.println("Salir");
                             System.out.println("Presione cualquier tecla para continuar");
                             System.in.read();
                    break; 
                       }//swicth anidado
                             
                   }      //switch case1
                    break;
            case 2: System.out.println("Usuario de empleado");
            System.out.println("Menu");
            System.out.println("1.Editar Usuario");
            System.out.println("2.Agregar Usuario");
            System.out.println("3.Eliminar usuario");
            System.out.println("4.Salir");
            System.out.println("dijite una opcion");
            od=teclado.nextInt();
            switch(od){
                       case 1:
                       System.out.println("Editar Usuario");  
                       System.out.println("Usuario que desea editar:");
                       System.out.println("Noemi 1634");
                       System.out.println("Edicio de nombre:");
                       System.out.println("Nombre nuevo: Noemi1654 ");
                       System.in.read();
                    break;
                       case 2:
                           System.out.println("Agergar usuario");
                           System.out.println("Nombre completo: Ariadna Flores Gonzalez");
                           System.out.println("Nombre de usuario: Ariada1646");
                           System.out.println("ID: 213132563");
                           System.out.println("USUARIO AGREGADO");  
                           System.in.read();
                    break;
                       case 3: 
                           System.out.println("Eliminar usuario");
                           System.out.println("Usuario que desea eliminar");
                           System.out.println("Brayan2425");
                           System.out.println("Usuario eliminado");
                           System.in.read();
                    break;
                       case 4:
                            System.out.println("Salir");
                             System.out.println("Presione cualquier tecla para continuar");
                             System.in.read();
                    break; 
        }  //case del editar
            case 3:   
             System.out.println("Facturas generadas");
            System.out.println("Menu");
            System.out.println("1.facturas generadas por dia");
            System.out.println("2.facturas generadas por mes");
            System.out.println("3.facturas generadas por año");
            System.out.println("4.Salir");
            System.out.println("dijite una opcion");
            lo=teclado.nextInt();
            switch(lo){
                case 1: 
                      System.out.println("1.facturas generadas por dia");
                        System.out.println("numero de facturas generadas ´por dia: 14");
                         System.in.read();
                    break; 
                case 2:   System.out.println("2. facturas generadas por mes");
                  System.out.println("numero de facturas generadas 145");
                   System.in.read();
                    break; 
                  
                case 3:   System.out.println("3. facturas generadas por año");
                      System.out.println("facturas generadas por año 1456");
                       System.in.read();
                    break; 
                case 4:  
                System.out.println("Salir");
                             System.out.println("Presione cualquier tecla para continuar");
                             System.in.read();
                    break;       
            }// anidado facturas
            
            case 4:
            System.out.println("Salir");
                             System.out.println("Presione cualquier tecla para continuar");
                             System.in.read();
                    break;         
    }//switch1
          }  //metodo
          
      public void mostrarDatos(){
         System.out.println("----");
        System.out.println("USUARIO EMPLEADO");
        System.out.println("---");
        System.out.println("******************");
        System.out.println("Uusuario:"+getUs());
        System.out.println("Contraseña:"+getCon());
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido:"+apellido);
       System.out.println("Direccion:"+direccion);    
        System.out.println("Cargo:"+rol);
        System.out.println("Sexo:"+sexo);
        System.out.println("Telefono:"+tel);
        System.out.println("ID:"+id);
        System.out.println("********************");   
    }
    
    
}
