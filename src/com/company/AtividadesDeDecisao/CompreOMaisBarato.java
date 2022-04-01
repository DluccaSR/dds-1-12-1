package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class CompreOMaisBarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do primeiro produto: ");
        double produto1 = scanner.nextDouble();
        System.out.print("Digite o preço do seu segundo produto: ");
        double produto2 = scanner.nextDouble();
        System.out.print("Digite o preço do seu terceiro produto: ");
        double prdouto3 = scanner.nextDouble();

        if (produto1 < produto2 && produto1 < prdouto3) {
            System.out.print("Seu numero é: " + produto1);
        } else if (produto2 < produto1 && produto2 < prdouto3) {
            System.out.print("Seu numero é: " + produto2);
        } else if (prdouto3 < produto1 && prdouto3 < produto2) {
            System.out.print("Seu numero é: " + prdouto3);

        }
    }
}
