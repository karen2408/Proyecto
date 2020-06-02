package Usuarios;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.IOException;

public class UsuarioC {
    String nombre;
    int ID;
    String Apellido;
    String Direccion;
    String Sexo;
    String Correo;
    int Telefono;
    String Masculino;
    String Femenino;
    int decision;
    
    public UsuarioC(String nombre, int ID, String Apellido, String Direccion, String Sexo, String Correo, int Telefono){
        this.nombre = nombre;
        this.ID = ID;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
    }
    
    public void Registro (){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre" +nombre);
        System.out.print("Ingrese sus apellidos" +Apellido);
        System.out.print("Ingrese su direccion" +Direccion);
        System.out.print("Ingrese su correo" +Correo);
        System.out.print("Ingrese su telefono" +Telefono);
        
        decision = entrada.nextInt();
        
        switch(decision){
            case 1: if(Sexo == Femenino){
                System.out.print("Seleciono el sexo femenino");
            } 
                decision = entrada.nextInt();
                break;
            case 2: if(Sexo == Masculino){
                System.out.print("Seleccione un genero");
            }
                decision = entrada.nextInt();
                break;     
        }
    }      
}
