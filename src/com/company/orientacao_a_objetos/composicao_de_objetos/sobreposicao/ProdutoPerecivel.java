package com.company.orientacao_a_objetos.composicao_de_objetos.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    protected Date dataDeValidade;
    public void identificar(){
        super.identificar();
        System.out.println("Minha data de validade é: " + dataDeValidade );
    }

}
