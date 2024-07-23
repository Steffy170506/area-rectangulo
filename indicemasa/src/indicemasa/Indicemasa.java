/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package indicemasa;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Indicemasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double peso, altura, IMC;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Este programa puede calcular su IMC");
        System.out.println("");
        
        System.out.println("Introduzca su peso en kilogramos");
        peso = in.nextDouble();
        System.out.println("");
        
        System.out.println("Introduzca su altura en centimetros");
        altura = in.nextDouble()/100;
        System.out.println("");
        
        IMC = peso / (Math.pow(altura, 2));
        
        System.out.println("Para un peso de " + peso + " kilogramos y \n");
        System.out.println("Para una altura de " + altura + " metros    Scanner teclado = new Scanner(System.in);\n" +
"    System.out.print(\"Introduzca el numero del que desea ver el factorial: \");\n" +
"    int num = teclado.nextInt();\n" +
"    if(num < 0) {\n" +
"      System.out.println(\"No se puede calcular factorial de un valor negativo.\");\n" +
"    } else {\n" +
"      int resultado = Factorial(num);\n" +
"      System.out.printf(\"El resultado es: %d\\n\", resultado);\n" +
"    }\n" +
"  }\n" +
"\n" +
"  public static int Factorial(int n) {\n" +
"    int factorial = 1;\n" +
"    for (int i = 2; i <= n; ++i) {\n" +
"      factorial *= i;\n" +
"    }\n" +
"    return factorial;\n" +
"  }\n" +
"} \n");
        System.out.println("El indice de masa corporal es: \n " + (int)IMC);
        System.out.println("");
        
        if(IMC < 16){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Necesita ingresar en un hospital");
            System.out.println("");
        } else if(IMC < 17){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene infrapeso");
            System.out.println("");
        } else if (IMC < 18){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene bajo peso");
            System.out.println("");
        } else if (IMC < 25){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene un peso normal (saludable)");
            System.out.println("");
        } else if (IMC < 30){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene sobre peso (obecidad grado I)");
            System.out.println("");
        } else if (IMC < 35){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene sobrepeso crónico (obesidad grado II)");
            System.out.println("");
        } else if (IMC < 40){
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene obesidad premórbida (obesidad grado III)");
            System.out.println("");
        } else {
            System.out.println("Su diagnóstico es");
            System.out.println("");
            System.out.println("Usted tiene obesidad mórbida (obesidad grado IV)");
            System.out.println("");
        }
    }
    }
    

