import java.util.Scanner;
public class CalculoSalarioNeto {
    private static final int porcentajeImpuestos = 0;
 public static void main(String[] args) {
    Scanner zi = new Scanner(System.in);
System.out.println("Ingrese el salario bruto mensual: ");
    double salarioBruto = zi.nextDouble();
System.out.println("Ingrese el porcentaje de impuestos: ");
    double pocentajeimpuestos = zi.nextDouble();
System.out.println("Ingrese las deducciones adicionales: ");
    double deduccionesAdicionales = zi.nextDouble();
    double impuesto = salarioBruto * (porcentajeImpuestos / 100);
    double salarioNeto = salarioBruto - impuesto - (deduccionesAdicionales);
System.out.println("Salario neto: " + salarioNeto);
        zi.close();
    }
}