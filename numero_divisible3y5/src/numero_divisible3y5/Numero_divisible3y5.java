/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_divisible3y5;

/**
 *
 * @author steph
 */
public class Numero_divisible3y5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int n = 1; n<=100; ++n){
            if (n % 5 == 0 && n % 3 == 0){
                System.out.println(n);
            }
        }
    }
    
}
