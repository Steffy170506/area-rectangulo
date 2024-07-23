import java.util.Scanner;
public class contador {
    public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner tec = new Scanner(System.in);
    //definir  el numero y limite
    int n=1, lim ;
    //pedirle al usuario que ingrese un numero
    System.out.println("Ingrese un numero");
    //guardar limite
    lim=tec.nextInt();

    do { 
    // Verifica si el número es impar
      if (n % 2 !=0) { 
        System.out.println(n);
      }
    // Incrementa el numero
      n++;
    //se incrementra el codigo mientras el numero sea menor que el limite
    } while(n<=lim);
      
     
      
}
}
    

