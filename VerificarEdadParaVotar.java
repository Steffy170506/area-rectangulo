import java.util.Scanner;
    public class VerificarEdadParaVotar {
        public static void main(String[] args) {
            Scanner grr = new Scanner(System.in);
            System.out.println("Ingresar edad: ");
            int edad = grr.nextInt();
            if (edad >= 18) {
                System.out.println("Ya puedes votar che");
            }else {
                System.out.println("Todavia no puedes votar che");
            }
            grr.close();
        }
}