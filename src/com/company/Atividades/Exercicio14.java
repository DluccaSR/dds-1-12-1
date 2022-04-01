package com.company.Atividades;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso dos peixes: ");
        Double pesoDosPeixes = scanner.nextDouble();
        byte limiteDeKGDePeixes = 50;
        byte multa = 4;
        double pesoExecedidio = pesoDosPeixes - limiteDeKGDePeixes;
        double resultado = pesoExecedidio * multa;
        System.out.print("O valor da multa de Joao é: " + resultado);
        scanner.close();
    }

    public static class CelsiusParafahrenheit {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println(" Digite um numero em Celsius ");

            double Celsius = sc.nextDouble();

            double Fahrenheit = ( Celsius * 9/5) + 32;

            System.out.println(" Sua conversão foi:" + " " + Fahrenheit);

            sc.close();
        }
    }
}
