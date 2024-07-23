import java.util.Scanner;
public class cal_menu {
    public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner tec = new Scanner(System.in);
    //definir numero 1, 2, y resultado 
    float n1, n2 , res;
    int op;
    // preguntarle al usuario que escoja el tipo de operacion que desea realizar
    do{System.out.println("Elige que tipo de operacion va a querer");
       System.out.println("Suma-1");
       System.out.println("Resta-2");
       System.out.println("Multiplicacion-3");
       System.out.println("Division-4");
       op = tec.nextInt();
      
       //diferente casos posibles que pueden realizarse
       switch(op){
        //se ejecutaran los diferentes casos posible
        case 1:
        // se ejecuta en caso de escoger suma
          System.out.println("Suma");
          //pide el usuario ingresar el primer numero
          System.out.println("Ingrese el primer numero");
          n1=tec.nextFloat();
          //pide el usuario ingresar el segundo numero
          System.out.println("Ingrese el segundo numero");
          n2=tec.nextFloat();
          res=n1+n2;
          System.out.println("El resultado es " +res);
          break;
        case 2:
        // se ejecuta en caso de escoger resta
          System.out.println("Resta");
          //pide el usuario ingresar el primer numero
          System.out.println("Ingrese el primer numero");
          n1=tec.nextFloat();
          //pide el usuario ingresar el segundo numero
          System.out.println("Ingrese el segundo numero");
          n2=tec.nextFloat();
          res=n1-n2;
          System.out.println("El resultado es " +res);
          break;  
        case 3:
        // se ejecuta en caso de escoger multiplicacion
          System.out.println("Multiplicacion");
          //pide el usuario ingresar el primer numero
          System.out.println("Ingrese el primer numero");
          n1=tec.nextFloat();
          //pide el usuario ingresar el segundo numero
          System.out.println("Ingrese el segundo numero");
          n2=tec.nextFloat();
          res=n1*n2;
          System.out.println("El resultado es " +res);
          break; 
        case 4:
        // se ejecuta en caso de escoger division
          System.out.println("Division");
          //pide el usuario ingresar el primer numero
          System.out.println("Ingrese el primer numero");
          n1=tec.nextFloat();
          //pide el usuario ingresar el segundo numero
          System.out.println("Ingrese el segundo numero");
          n2=tec.nextFloat();
          res=n1/n2;
          System.out.println("El resultado es "+res);
          break;
        default:
          System.out.println("No valido");
          break;

        }
    
    
    
    }while (op!=4);

    }
}
