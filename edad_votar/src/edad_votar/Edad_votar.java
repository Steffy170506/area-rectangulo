/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edad_votar;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Edad_votar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese su edad");
        int e = sc.nextInt();
        if(e>=18){
            System.out.println("usted puede votar");
        }else{
            System.out.println("usted es menor de edad y no puede votar");
        }
    }
    
}

    
    

