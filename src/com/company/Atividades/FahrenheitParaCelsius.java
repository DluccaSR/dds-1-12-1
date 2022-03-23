package com.company.Atividades;

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu numero em fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.print("Seus Graus sao " + celsius);
        scanner.close();
    }
}
