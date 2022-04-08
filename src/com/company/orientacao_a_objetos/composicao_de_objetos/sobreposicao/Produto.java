package com.company.orientacao_a_objetos.composicao_de_objetos.sobreposicao;

public class Produto {
    protected String descricao;
    public void identificar() {
        System.out.println("Minha descrição é: " + descricao + ".");
    }
}