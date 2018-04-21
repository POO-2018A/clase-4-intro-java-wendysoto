/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;
import java.util. Scanner;

/**
 *
 * @author Wendy Soto
 */
public class EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     
      System.out.println("ESCUELA DE FORMACION DE TECNOLOGOS");
        System.out.println("NOMBRE: Wendy Soto");
        System.out.println("EJERCICIO 6");
       
        boolean llueve=true;
        boolean neva=true;
        double temperatura;
        System.out.println("ingrese la temperatura C: ");
        temperatura=scan.nextDouble();
         if(temperatura<10.0){
             llueve=true;
             neva=true;
         }
         else if(temperatura>10.0){
             llueve=false;
             neva=false;
        }
        if(llueve&&neva){           
            System.out.println("NOS QUEDAMOS EN CASA");
                    
        }
        else{
            System.out.println("VAMOS AFUERA");
            
        }
        
        
        
    }
    
    
}
