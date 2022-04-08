package com.company.programacao_orientada_a_objetos.metodo_Instancia.cliente_instancia;

public class ClienteInstancia {
    public static void main(String[] args) {
        System.out.println("Quantidade minima estoque: " + Produtos.quantidadeMinimaEstoque);

        Produtos produto = new Produtos();
        produto.nome = "Caneca";

        Produtos produto2 = new Produtos();
        produto2.nome = "Carteira";

        Impressao.informacao("Produto 1: " + produto.nome);
        Impressao.informacao("Produto 2: " + produto2.nome);
    }
}
