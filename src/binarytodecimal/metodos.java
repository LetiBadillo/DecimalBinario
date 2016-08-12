/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytodecimal;

/**
 *
 * @author ASUS
 */
public class metodos {
    
     
    public static void convierte(int n) {
        int r;

        if (n <= 1) {
            System.out.print(n);
            return;   // KICK OUT OF THE RECURSION
        }

        r = n %2; 
        convierte(n >> 1);
        System.out.print(r);
    }

}
        




