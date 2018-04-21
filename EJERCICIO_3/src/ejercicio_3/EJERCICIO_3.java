/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;
import java.util.Scanner;

/**
 *
 * @author Wendy Soto
 */
public class EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("EJERCICIO 3");
        System.out.println("INGRESE SU EDAD ACTUAL");
        int edad=scan.nextInt();
        if(edad>0&&edad <18){
            System.out.println("Usted es menor de edad");
        }
        else if(edad>18){
            System.out.println("Usted es mayor de edad");
        }
       
    }
    
}
