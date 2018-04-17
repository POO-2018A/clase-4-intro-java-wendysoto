package paridad;

import java.util.Scanner;

/**
 *
 * @author chalosalvador
 */
public class Paridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = scan.nextInt();
        
        System.out.println("Ingrese su sueldo: ");
        double sueldo = scan.nextDouble();
        
        System.out.println("");
        System.out.println("Los datos ingresados son:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        
        System.out.println();
        
        System.out.println("Su nombre es: " + nombre + ", usted tiene " + edad +
                " años y gana " + sueldo + " dolares.");        
    }
    
}
