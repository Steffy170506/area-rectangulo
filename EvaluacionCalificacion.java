import java.util.Scanner;
public class EvaluacionCalificacion {
    public static void main(String[] args) {
        System.out.println("Ingresar calificacion");
        Scanner aaa = new Scanner(System.in);
        int calificacion = aaa.nextInt();
    if (calificacion > 90 && calificacion <= 100) {
            System.out.println("A");
        };
    if (calificacion > 80 && calificacion <= 89) {
            System.out.println("B");
        };
    if (calificacion > 70 && calificacion <= 79) {
            System.out.println("C");
        };
    if (calificacion > 60 && calificacion <= 69) {
            System.out.println("D");
        };
    if (calificacion < 60) {
            System.out.println("F");
        };
        aaa.close();
        
    }
}