import java.util.Scanner;
public class salario {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("ingrese el salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();
        
  
        System.out.print("ingrese el porcentaje de impuestos ");
        double porcentajeImpuestos = scanner.nextDouble();

        System.out.print("ingrese las deducciones adicionales: ");
        double deduccionesAdicionales = scanner.nextDouble();

        double impuesto = salarioBruto * (porcentajeImpuestos / 100);
        

        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

      
        System.out.printf("El salario Neto es: %.2f/n", salarioNeto);

        scanner.close();
    }
}