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
}
