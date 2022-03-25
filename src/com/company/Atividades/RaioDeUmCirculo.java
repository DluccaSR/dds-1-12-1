package com.company.Atividades;

import java.util.Scanner;

public class RaioDeUmCirculo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o raio do Circulo ");
            Double raio = scanner.nextDouble();
            Double raioAoQuadrado = raio * raio;
            Double pi = 3.14;
            Double area = raioAoQuadrado * pi;

            System.out.println("A Area do circulo e: " + area + "cm");
            scanner.close();
        }
}
