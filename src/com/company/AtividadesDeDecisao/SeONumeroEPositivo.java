package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class SeONumeroEPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu numero: ");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.print("Seu numero é positivo");
        } else {
            System.out.print("Seu numero é negativo");
        }
    }
}
