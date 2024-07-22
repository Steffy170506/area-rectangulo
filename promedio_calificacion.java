
import java.util.Scanner;

public class promedio_calificacion{
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    //definir calificacion 1,2, y 3
    //guardar calificaciones
    double cal1, cal2, cal3;
    System.out.println("Ingrese la calificacion del parcial");
    cal1=teclado.nextDouble();
    System.out.println("Ingrese la calificacion del proyecto");
    cal2=teclado.nextDouble();
    System.out.println("Ingrese la calificacion del examen");
    cal3=teclado.nextDouble();


    //sacar el resultado de los tres en procentaje

    double res= (cal1*40+cal2*30+cal3*30)/100;
    
    //sacar el promedio
    System.out.printf("El promedio es:"+res);



   
    

  }
}