/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuento_precio;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Descuento_precio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc= new Scanner(System.in);
        System.out.println("ingrese su monto de compra: \n ");
        double m = sc.nextDouble();
        if(m>=0&&m<=100){
         System.out.println("tu pago total es: \n"+m);
        }else if(m>100&&m<=200){
            double d=m*.10;
            double tp=m-d;
         System.out.println("tu pago total es: \n"+tp);
        }else if(m>200&&m<=500){
            double d=m*.20;
            double tp=m-d;
         System.out.println("tu pago total es: \n"+tp);
        }else if(m>500){
            double d=m*.25;
            double tp=m-d;
         System.out.println("tu pago total es: \n"+tp);
        }
    }
    
}

    
    

