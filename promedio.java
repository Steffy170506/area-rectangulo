import java.util.Scanner;

public class promedio{
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double num1,num2,num3,res,promedio;
    //pedir al usuario que ingrese los tres numeros
    System.out.println("Ingrese el primer numero");
    num1=teclado.nextDouble();
    System.out.println("Ingrese el segundo numero");
    num2=teclado.nextDouble();
    System.out.println("Ingrese el tercer numero");
    num3=teclado.nextDouble();
    //sacar el resultado de los tres
    res=num1+num2+num3;
    //sacar el promedio
    promedio=res/3;
    System.out.printf("El promedio es:"+promedio);
  }

}