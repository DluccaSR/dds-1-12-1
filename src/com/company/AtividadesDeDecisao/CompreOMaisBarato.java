package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class CompreOMaisBarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do primeiro produto: ");
        double precoDoProduto1 = scanner.nextDouble();
        System.out.print("Digite o preço do seu segundo produto: ");
        double precoDoProduto2 = scanner.nextDouble();
        System.out.print("Digite o preço do seu terceiro produto: ");
        double precoDoPrdouto3 = scanner.nextDouble();
        boolean produto1EoMaisBarato = precoDoProduto1 < precoDoProduto2 && precoDoProduto1 < precoDoPrdouto3;
        boolean produto2EoMaisBarato = precoDoProduto2 < precoDoProduto1 && precoDoProduto2 < precoDoPrdouto3;
        boolean produto3EoMaisBarato = precoDoPrdouto3 < precoDoProduto1 && precoDoPrdouto3 < precoDoProduto2;
        if (produto1EoMaisBarato) {
            System.out.print("O produto mais barato é o primeiro produto que custa: " + precoDoProduto1 + "R$");
        } else if (produto2EoMaisBarato) {
            System.out.print("O produto mais barato é o segundo produto que custa" + precoDoProduto2 + "R$");
        } else if (produto3EoMaisBarato) {
            System.out.print("O produto mais barato é o terceiro produto que custa numero é: " + precoDoPrdouto3 + "R$");
        }
        scanner.close();
    }
}
