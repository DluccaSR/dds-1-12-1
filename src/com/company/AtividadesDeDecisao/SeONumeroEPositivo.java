package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class SeONumeroEPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu numero: ");
        double numero = scanner.nextDouble();
        boolean numeroEMaiorOuIgualAZero = numero >= 0;
        if (numeroEMaiorOuIgualAZero) {
            System.out.print("Seu numero é Positivo!");
        } else {
            System.out.print("Seu numero é Negativo!");
        }
        scanner.close();
    }
}
