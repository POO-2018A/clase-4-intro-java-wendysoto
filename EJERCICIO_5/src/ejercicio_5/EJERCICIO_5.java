/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;
import java.util.Scanner;

/**
 *
 * @author Wendy Soto
 */
public class EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        
        System.out.println("EJERCICIO 5");
        System.out.println("ingrese un numero del 1 al 12");
        int num=scan.nextInt();
        switch(num){
            case 1:
             System.out.println("ENERO");  
             break;
            case 2:
             System.out.println("FEBRERO"); 
             break;
            case 3:
             System.out.println("MARZO");
             break;
            case 4:
             System.out.println("ABRIL"); 
             break;
            case 5:
             System.out.println("MAYO");
             break;
            case 6:
             System.out.println("JUNIO"); 
             break;
            case 7:
             System.out.println("JULIO");  
             break;
            case 8:
             System.out.println("AGOSTO"); 
             break;
            case 9:
             System.out.println("SEPTIEMBRE");  
             break;
             case 10:
             System.out.println("OCTUBRE");
             break;
             case 11:
             System.out.println("NOVIEMBRE");
             break;
             case 12:
             System.out.println("DICIEMBRE"); 
             break;
             default:
             System.out.println("Num...fuera de rango");
        }
    }
    
}
