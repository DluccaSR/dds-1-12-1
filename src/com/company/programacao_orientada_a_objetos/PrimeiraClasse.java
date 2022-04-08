package com.company.programacao_orientada_a_objetos;

import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         Produto produto = new Produto();
         produto.nome = "Processador";
         produto.precoUnitario = 500.0;
        System.out.println("Digite a quantidade que deseja: ");
        produto.quantidade = 15;


         exibirQuantidadeEmEstoque(produto);
    }

    private static void exibirQuantidadeEmEstoque(Produto produto) {
        System.out.print(  "E a quantidade em estoque do produto " + produto.nome + " e de: " + produto.quantidade + " unidades" + " e o preço e de: R$" + produto.precoUnitario);
    }
}
