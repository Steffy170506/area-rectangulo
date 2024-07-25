import java.util.Scanner;
public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner aghh = new Scanner(System.in);
        System.out.print("Ingresar cantidad de numeros a ingresarxd: ");
        int cantidad = aghh.nextInt();
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int i = 0;
        while (i < cantidad) {
            System.out.print("Ingresar numero: ");
            int numero = aghh.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
            i++;
        }
        System.out.println("Numero de positivos: " + positivos);
        System.out.println("Numero de negativos: " + negativos);
        System.out.println("Numero de ceros: " + ceros);
        aghh.close();
    }
}
