import java.util.Random;
import java.util.Scanner;

public class adivinar_numero {
    public static void main(String[] args) {
       
        Random random = new Random();
       
        int numeroSecreto = random.nextInt(1000) + 1;
       
        Scanner scanner = new Scanner(System.in);
        
        int adivinanza = 0;
       
        while (adivinanza != numeroSecreto) {
 
            System.out.print("Adivina el número entre 1 y 1000: ");
            adivinanza = scanner.nextInt();
    
            if (adivinanza < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (adivinanza > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
 
        scanner.close();
      
        System.out.println("Gracias por jugar.");
            }
        }
    }
}

