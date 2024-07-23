import java.util.Scanner;
public class num_positivos {
    @SuppressWarnings("resource")
    public static void main(String[] args){ 
    Scanner tec = new Scanner(System.in);
    //definir numero, suma, numero total, y media 
    int num, sum=0, tot_num=0, media;
    //pedir al usuario que ingrese un numero
    System.out.println("Ingrese numero");
    num=tec.nextInt();
    //establecer ciclo usando while
    while(num>0)
    {
         sum=sum+num;
        tot_num++;
        System.out.println("Ingrese otro numero");
        num=tec.nextInt();
    }
    //si se ingresa un numer menor que 0, se imprimira el resultado
     if (num<=0)
     {
        media=sum/tot_num;
        System.out.println("La media es:"+media); 
     }
    {
      
    }
}
}
