
import java.util.Scanner;
public class contar_letras {
    
    
    public static void main(String[] args) throws Exception {
        Scanner Teclado =new Scanner(System.in);
        String Palabra;
        int contador = 0;
        System.out.print("ingresa una palabra: ");
        Palabra = Teclado.nextLine();
        for (int i = 0; i < Palabra.length(); i++) {
            if(Palabra.charAt(i)=='a'){
                contador =contador+ 1;

            }
        }
        System.out.println("el numero de letras a es: " + contador);
        Scanner close;

}
}