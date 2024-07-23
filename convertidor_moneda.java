
import java.util.Scanner;
public class convertidor_moneda {
    public static void main(String[] args) throws Exception {

    Scanner Texto =new Scanner(System.in);
    Double Cantidad, Resultado; 
    String Moneda;

    System.out.println("Indica la Cantidad que quieras convertir: ");
    Cantidad = Texto.nextDouble();
    

    Scanner Teclado =new Scanner(System.in);
    System.out.print("Dolar (USD)" + "\n\b" + 
    "Euro (EUR)" + "\n\b" + 
    "Bath (THB)" + "\n\b" + 
    "Yen (JPY)" + "\n\b" + 
    "Won (KRW)" + "\n\b" + 
    "Dolar Australiano (AUD)" + "\n\b" +
    "Sol (PEN)"  + "\n\b" +
    "Dolar Canadiense (CAD)"  + "\n\b" +
    "Bolivar (VES)"  + "\n\b" +
    "Peso Argenito (ARS)" + "\n\b");
    System.out.print("Ingresa la moneda que quiras convertir tu dinero, (escribir solo lo que esta en el parentesis)" + "\n\b");

    Moneda = Teclado.nextLine();

    switch (Moneda.toUpperCase()) {
        case "USD":
            Resultado = Cantidad * 0.05558;
            System.out.println("La cantidad de "+ Cantidad + " en USD es de: " + Resultado);
            break;

            case "EUR":
            Resultado = Cantidad * 0.0512;
            System.out.println("La cantidad de "+ Cantidad + " en EUR es de: " + Resultado);
            break;

            case "THB":
            Resultado = Cantidad * 2.0226;
            System.out.println("La cantidad de "+ Cantidad + " en THB es de: " + Resultado);
            break;

            case "JPY":
            Resultado = Cantidad * 8.735;
            System.out.println("La cantidad de "+ Cantidad + " en JPY es de: " + Resultado);
            break;

            case "KRW":
            Resultado = Cantidad * 77.1883;
            System.out.println("La cantidad de "+ Cantidad + " en KRW es de: " + Resultado);
            break;

            case "AUD":
            Resultado = Cantidad * 0.0839;
            System.out.println("La cantidad de "+ Cantidad + " en AUD es de: " + Resultado);
            break;

            case "PEN":
            Resultado = Cantidad * 0.21;
            System.out.println("La cantidad de "+ Cantidad + " en PEN es de: " + Resultado);
            break;

            case "CAD":
            Resultado = Cantidad * 0.0767;
            System.out.println("La cantidad de "+ Cantidad + " en CAD es de: " + Resultado);
            break;

            case "VES":
            Resultado = Cantidad * 0.39;
            System.out.println("La cantidad de "+ Cantidad + " en VES es de: " + Resultado);
            break;

            case "ARS":
            Resultado = Cantidad * 51.60;
            System.out.println("La cantidad de "+ Cantidad + " en ARS es de: " + Resultado);
            break;
            default: System.out.print("La moneda no Existe");
    }
    }
    }


