/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytodecimal;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BinarytoDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int u; //Declaración de variables
        Scanner sc = new Scanner(System.in); //Creación del escanner
        System.out.println("Holi, introduzca un número en decimal"); 
        u = sc.nextInt();
        if (u < 0) {
            System.out.println("Por favor, escriba un entero positivo");
        } else { 

            System.out.println("El número en binario es: "); 
        metodos.convierte(u);
        System.out.println(""); 
        }
    }

      
        
    }
    

