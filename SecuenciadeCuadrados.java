import java.util.Scanner;
public class SecuenciadeCuadrados {
    public static void main(String[] args) {
        Scanner sisi = new Scanner(System.in);
        System.out.println("Ingresar numero entero positivo: ");
        int numero = sisi.nextInt();
            int i = 1;
            do {
                int cuadrado = i * i;
                System.out.println("El cuadrado de " + i + "es:" + cuadrado);
                i = i + 1;
            } while (i <= numero);
        
        sisi.close();
    }
}