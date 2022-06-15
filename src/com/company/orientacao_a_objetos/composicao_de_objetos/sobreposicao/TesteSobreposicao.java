package com.company.orientacao_a_objetos.composicao_de_objetos.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "Carne";
        pp.dataDeValidade = new Date();
        pp.identificar();
    }
}
