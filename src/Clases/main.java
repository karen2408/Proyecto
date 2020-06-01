/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Usuarios.Empleado;
import java.io.IOException;

/**
 *
 * @author Karen Cruz
 */
public class main {
     public static void main (String [] args) throws InterruptedException, IOException{
         Empleado emple=new Empleado("Brayan125", 664454, "Brayan", "Apellido", "Heroes Ixtapaluca","Ventas", "Masculino", "brayan10ww@gmail.com", 56464154, 15245);
         emple.mostrarDatos();
         emple.funcion();
         
     }
    
}
