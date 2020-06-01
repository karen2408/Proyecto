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
public class Empleado extends Perfil {
    private String nombre;
    private String apellido;
    private String direccion;
    private String rol;
    private String sexo;
    private String correo;
    private int tel;
    private int id;
    private int idart;
    int art;
    int opc;
  
    public Empleado (String us, int con,String nombre,String apellido,String direccion,String rol,String sexo,String correo,int tel,int id){
        super(us,con);
        this.nombre=this.nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.rol=rol;
        this.sexo=sexo;
        this.correo=correo;
        this.tel=this.tel;
        this.id=id; 
        this.idart=idart;
        
    }
    
    
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
    
    
    public void funcion() throws InterruptedException, IOException{
        Scanner teclado=new Scanner(System.in);
        System.out.println("MENU DE OPCIONES");
        System.out.println(" 1.Vsualizacion de inventario ");
        System.out.println("2.Creacion de factura");
        System.out.println("3.salida3");
        System.out.println("Dijite opcion");
        
        opc=teclado.nextInt();
        switch(opc){
            case 1: System.out.println("Visualizacion de inventario");
                   System.out.println("Desea revisar algun articulo");
                   System.out.println("MENU");
                   System.out.println("1.Buscar articulo");
                   System.out.println("2.Ver numero de existencia");
                   System.out.println("3.salir");
                   System.out.println("Dijite opcion");
                   art=teclado.nextInt();
                   switch(opc){
                       case 1:
                       System.out.println("BUSQUEDA DE ARTICULOS");  
                       System.out.println("MOSTRANDO PRODUCTO...");
                       System.out.println("........");
                       System.out.println("ARTUCULO");
                       System.out.println("Blusa gris-ID:156546");
                       System.in.read();
                       break;
                       
                       case 2: 
                            System.out.println("ARTICULOS EN EXISTENCIA");
                            System.out.println("Ingrese Id de articulo");
                            System.out.println("21654654");
                            System.out.println(".....");
                            System.out.println("Articulo encontrado");
                            System.out.println("Pantalon mezclilla");
                            System.out.println("EN EXISTENCIA:");
                            System.out.println("TallaS-5 disponibles,"+"Talla M-3 en disponibles"+"Talla L-6 disponibles");
                            System.in.read();
                            break;
                       case 3:   
                             System.out.println("Salir");
                             System.out.println("Presione cualquier tecla para continuar");
                             System.in.read();
                    break;           
                   }      
                    break;
            case 2: System.out.println("Creacion de factura");
            System.out.println("Nombre: Fernando");
            System.out.println("Apellido: Cruz Gonzalez");
            System.out.println("Numero Tel: 5589464652");
            System.out.println("RFC:2632656");
            System.out.println("Direccion: Ixtapaluca,Edo.Mex");
                    System.in.read();
                    break;
            default: System.out.println("Salir");
                    System.out.println("Presione cualquier tecla para continuar");
                    System.in.read();
                    break;
         
        }      
    }
 
}
