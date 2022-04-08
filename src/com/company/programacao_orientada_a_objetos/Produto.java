package com.company.programacao_orientada_a_objetos;

public class Produto {
    static final Integer QUANTIDADE_MINIMA_DE_PRODUTOS = 10;

    String nome;
    String nome2;

    Double precoUnitario;

    Integer quantidade;

    Integer quantidadeMinima;

    Integer quantidadeEmEstoque;

//    public Integer verificarSePrecisarRepor() {
//        produto.quantidade = 10;
//        produto.nome2 = "Celular";
//        produto.quantidadeEmEstoque = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite a quantidade de " + produto.nome2 + " em estoque: ");
//        produto.quantidadeEmEstoque = scanner.nextInt();
//        if (produto.quantidadeEmEstoque < produto.quantidadeMinima) {
//            System.out.println("Precisa repor o estoque de " + produto.nome2);
//        } else {
//            System.out.println("Não precisa repor o estoque de " + produto.nome2);
//        }
//    }


    public Boolean eNessesarioReporEstoque() {
        return quantidadeEmEstoque < Produto.QUANTIDADE_MINIMA_DE_PRODUTOS;
    }
}





