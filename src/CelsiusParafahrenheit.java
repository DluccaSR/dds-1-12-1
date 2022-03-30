
import java.util.Scanner;

public class CelsiusParafahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite um numero em Celsius ");

        double Celsius = sc.nextDouble();

        double Fahrenheit = ( Celsius * 9/5) + 32;

        System.out.println(" Sua conversão foi:" + " " + Fahrenheit);

        sc.close();
    }
}
