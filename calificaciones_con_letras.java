import java.util.Scanner;

public class calificaciones_con_letras {

    public static void main(String[] args) throws Exception {

        Scanner Teclado =new Scanner(System.in);
        int Calificacion;

        System.out.print("Ingresa Calificacion del estudiante: ");
        Calificacion = Teclado.nextInt();
        if(Calificacion < 60){
            System.out.println("Calificacion: F");
        }else if(Calificacion >= 60 && Calificacion < 70 ){
            System.out.println("Calificacion: D");
        }else if(Calificacion >= 70 && Calificacion < 80 ){
            System.out.println("Calificacion: C");
        }else if(Calificacion >= 80 && Calificacion < 90 ){
            System.out.println("Calificacion: B");
        }else System.out.println("Calificacion: A");
            Scanner close;
    }
}
