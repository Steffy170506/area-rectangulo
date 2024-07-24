/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progr_vocales_o.no_vocales;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Progr_vocales_oNo_vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            char letrass;
            
            System.out.println("Por favor, escriba una letra:");
            
            while (true) {
                letrass = scanner.next().charAt(0);
                
                if (letrass == ' ') {
                    System.out.println("rPograma terminado.");
                    break;
                }
                
                if (Character.isLetter(letrass)) {
                    if (palabraesvocal(letrass)) {
                        System.out.println(letrass + " es una vocal.");
                    } else {
                        System.out.println(letrass + " es una consonante.");
                    }
                } else {
                    System.out.println(letrass + " no es una letra válida.");
                }
            }
        }
    }

    public static boolean palabraesvocal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
    
    

