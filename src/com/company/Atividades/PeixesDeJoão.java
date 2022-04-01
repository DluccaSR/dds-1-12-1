package com.company.Atividades;

import java.util.Scanner;

public class PeixesDeJoão {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso dos peixes: ");
        Double pesoDosPeixes = scanner.nextDouble();
        byte limiteDeKGDePeixes = 50;
        byte multa = 4;
        double limiteDePeixes = pesoDosPeixes - limiteDeKGDePeixes;
        double resultado = limiteDePeixes * multa;
        System.out.print("O valor da multa de Joao é: " + resultado);
        scanner.close();
    }

    public static class Exercicio16 {
    }
}
