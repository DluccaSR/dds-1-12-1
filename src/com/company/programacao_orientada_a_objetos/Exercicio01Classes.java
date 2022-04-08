package com.company.programacao_orientada_a_objetos;

public class Exercicio01Classes {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.quantidade = 10;
        produto.nome = "Celular";
        System.out.println("eee " + produto.eNessesarioReporEstoque());
    }
}


