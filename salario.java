import java.util.Scanner;
public class salario {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //solicitar al usuario el salario bruto mensual al usuario
        System.out.print("ingrese el salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();
        
        //Solicitar el porcentaje de impuestos al usuario
        System.out.print("ingrese el porcentaje de impuestos ");
        double porcentajeImpuestos = scanner.nextDouble();

        //Solicitar las deducciones adicionales al usuario
        System.out.print("ingrese las deducciones adicionales: ");
        double deduccionesAdicionales = scanner.nextDouble();

        //calcular impuestos
        double impuesto = salarioBruto * (porcentajeImpuestos / 100);
        
        //calcular el salario neto
        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

        //Mostrar el salario neto
        System.out.printf("El salario Neto es: %.2f/n", salarioNeto);

        scanner.close();
    }
}