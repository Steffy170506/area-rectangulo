import java.util.Scanner;

public class area {
    
    public static void main(String[] args) {
        Scanner texto =new Scanner(System.in);
        int lado1, lado2, area;
        //Ingresar primer lado 1
        System.out.println("Ingresa longitud del lado 1");
        lado1 = texto.nextInt();
        
        //
        System.out.println("Ingresa longitud del lado 2");
        lado2 = texto.nextInt();

       area = lado1 * lado2;

       System.out.println("El area del rectangulo es:" + area);

       Scanner close;


    }
}




