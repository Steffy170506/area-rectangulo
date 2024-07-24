import java.util.Scanner;

public class contador_digitos2 {
    
    public static void main(String[] args) throws Exception {
Scanner Teclado = new Scanner(System.in);
        int n, cifras;
        char car;
        do{
            System.out.print("Introduce un número entero: ");
            n = Teclado.nextInt();
            cifras= 0;  
            while(n!=0){  
                    n = n/10;    
                   cifras++;         
            }
            System.out.println("El número tiene " + cifras+ " cifras");       
            System.out.println("Deseas continuar?" + "\n\b");                                    
            System.out.print("Escribir (S) si desea seguir o (N) si desea detener: ");
            car = (char)System.in.read();
        }while(car!='n' && car != 'N');   



    }
}
