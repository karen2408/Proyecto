/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Karen Cruz
 */
public class Categoria {
    String Color;
    int Talla;
    String Tipo;
    int opc;
    int opc2;

    public Categoria(String Color, int Talla, String Tipo) {
        this.Color = Color;
        this.Talla = Talla;
        this.Tipo = Tipo;
    }
    
    public void MostrarRopa(){
    Scanner entrada = new Scanner(System.in);
    System.out.print("  Lista de ropa  ");
    System.out.print("  Selecciones una categoria");
    System.out.print("  1.- Caballero  ");
    System.out.print("  2.- Dama  ");
    opc=entrada.nextInt();
    
    if(opc == 1){
        System.out.print("Usted accedio a la ropa de Caballero");
        System.out.print("Seleccione una categoria");
        System.out.print("1.- Playeras ");
        System.out.print("2.- Pantalon ");
    } if (opc2 == 1){
        System.out.print("Aqui tiene las playeras existentes");
        System.out.print("Este es el color de tu ropa" + Color);
        System.out.print("Este es el la talla de tu ropa" + Talla);
        System.out.print("Este es el tipo de tu ropa" + Tipo);
    } if (opc2 ==2){
        System.out.print("Aqui tiene los pantalones existentes");
        System.out.print("Este es el color de tu ropa" + Color);
        System.out.print("Este es el la talla de tu ropa" + Talla);
        System.out.print("Este es el tipo de tu ropa" + Tipo);
    }
    
    if(opc == 2){
        System.out.print("Usted accedio a la ropa de dama");
        System.out.print("Seleccione una categoria");
        System.out.print("1.- Vestidos ");
        System.out.print("2.- Blusas ");
    } if (opc2 == 1){
        System.out.print("Aqui tiene los vestidos existentes");
        System.out.print("Este es el color de tu ropa" + Color);
        System.out.print("Este es el la talla de tu ropa" + Talla);
        System.out.print("Este es el tipo de tu ropa" + Tipo);
    } if (opc2 ==2){
        System.out.print("Aqui tiene las blusas existentes");
        System.out.print("Este es el color de tu ropa" + Color);
        System.out.print("Este es el la talla de tu ropa" + Talla);
        System.out.print("Este es el tipo de tu ropa" + Tipo);
    }
    }
    
}  
