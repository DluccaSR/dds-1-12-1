package com.company.AtividadesDeDecisao;

import java.util.Arrays;
import java.util.Scanner;

public class PecaNumeroMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu primeir numero: ");
        double numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
    if (numeroUm > numero2) {
        System.out.print("O maior numero é: " + numeroUm);
    } else {
        System.out.print("O maior numero é: " + numero2 );

       }
    }
}
