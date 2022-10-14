package com.mycompany.lab1_joselobo;

import java.util.Scanner;
/**
 *
 * @author RafaelLobo
 */
public class Lab1_JoseLobo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("---");
        
        System.out.println("----Bienvenido el sistema de calculo de promedio: ");
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
       
        System.out.print("Ingrese su nota final de la primera Clase: ");
        double PrimeraClase = entrada.nextDouble();
        
        System.out.print("Ingrese su nota final de la segunda Clase: ");
        double SegundaClase = entrada.nextDouble();
        
        System.out.print("Ingrese su nota final de la tercera Clase: ");
        double TerceraClase = entrada.nextDouble();
        
        System.out.print("Ingrese su nota final de la cuarta Clase: ");
        double CuartaClase = entrada.nextDouble();
        
        //calculo//
        double SumaTotal = PrimeraClase + SegundaClase + TerceraClase + CuartaClase;
        double promedio = SumaTotal / 4 ;
        System.out.println(nombre + "Su Promedio es: " + promedio);
        
                
               
    }
}
