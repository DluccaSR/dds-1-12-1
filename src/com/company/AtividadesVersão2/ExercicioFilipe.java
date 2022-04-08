package com.company.AtividadesVersão2;

import java.util.Scanner;

public class ExercicioFilipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite qual preço do seu produto: ");
        double precoDoProduto = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        double quantidadeDoProduto = scanner.nextDouble();
        double subtotal = quantidadeDoProduto * precoDoProduto;
        System.out.println("o subtotal e de: " + subtotal);
        double desconto = 0.0;
        byte cem = 100;
        byte dez = 10;
        Boolean comprarMaisDe10Produtos = quantidadeDoProduto >= dez;
        Boolean comprarMenosQue10Produtos = quantidadeDoProduto < dez;
        if (comprarMaisDe10Produtos) {
            desconto = 0.1;
            double subtotalDescontado = subtotal / desconto;
            double subtotalDividido =  subtotalDescontado / cem;
            System.out.println("O valor do seu desconto e de: R$-" + subtotalDividido );
            double valorFinal = subtotal - subtotalDividido;
            System.out.println("O valor que ira pagar e de: R$" + valorFinal );
        } else if (comprarMenosQue10Produtos) {
            System.out.println("O seu desconto e de 0%" );
            System.out.print("O valor que voce vai pagar e de: R$" + subtotal );
        }
    }
}
