package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class ExercicioTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preco do produto: ");
        double precoDoProduto = scanner.nextDouble();
        byte cem = 100;
        System.out.print("Digite o tipo de pagamento [1 Para pagamento à vista] / [2 Para pagamento à prazo] : ");
        Integer tipoDePagamento = scanner.nextInt();

        Boolean pagamentoAVista = tipoDePagamento.equals(1);

        double juros = 0.0;

        if (!pagamentoAVista) juros = 10.0;


        double acrescimo = precoDoProduto * juros / cem;
        double precoAPagar = acrescimo + precoDoProduto;
        System.out.printf("Você vai pagar: " + precoAPagar);
        scanner.close();
    }
}
