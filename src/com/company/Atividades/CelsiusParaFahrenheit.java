package com.company.Atividades;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite seu numero em Celsius: ");
            //Entrada
            double celsius = scanner.nextDouble();
            int multilicacaoDaFormula = 9;
            double divisorDaFormula = 5;
            double fatorDeSoma = 32;
            // Processamento
            double fahrenheit = (celsius * multilicacaoDaFormula) / divisorDaFormula + fatorDeSoma;
            //Saida
            System.out.print("Sua temperarura é: " + fahrenheit + " fahrenheit");
            scanner.close();
        }
}
