import java.util.Scanner;
public class convertir {
    public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner tec = new Scanner(System.in);   
    //definir celsius
     double cel;
    
      //pedir datos a usuario
     System.out.println("Ingrese en grados Celsius");
     //guardar datos
     cel=tec.nextDouble();
     // usario escoge far o kel
     System.out.println("Ingresa si desea convertir a grados Farenheit o Kelvin: ");
     //convertir a kelvin
     double kel=cel+273.15;
     // convertir a farenheit 
     double far= cel*9/5+32;

     String c = tec.next();
     
     
      switch (c) {
        //opcion de farenheit
        case "Far":
         System.out.println("Eligiste Farenheit: "+far); 
            break;
        //opcion de kelvin
        case "Kel":
         System.out.println("Eligiste Kelvin: "+kel); 
               break;
        default:
         System.out.println("No valida");
            break;
            

        }  
      }
    }
  

