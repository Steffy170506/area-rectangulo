/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador_numimpar;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Contador_numimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número entero positivo
        try ( // TODO code application logic here
        // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un número entero positivo
            System.out.print("Ingrese un número entero positivo: ");
            int numero = scanner.nextInt();
            // Inicializar el contador
            int contador = 1;
            // Imprimir los números impares desde 1 hasta el número ingresado
            System.out.println("Números impares desde 1 hasta " + numero + ":");
            // Bucle do-while para imprimir los números impares
            do {
                if (contador % 2 != 0) {
                    System.out.println(contador);
                }
                contador++;
            } while (contador <= numero);
            // Cerrar el objeto Scanner
        }
    }
}
    
    

