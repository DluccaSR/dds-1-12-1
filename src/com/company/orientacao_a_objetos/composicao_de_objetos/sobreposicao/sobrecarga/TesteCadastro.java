package com.company.orientacao_a_objetos.composicao_de_objetos.sobreposicao.sobrecarga;

public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("José", 32);
        cadastroPessoa.cadastro(pessoa);
        cadastroPessoa.cadastrar("Maria", 25);
        cadastroPessoa.cadastrar("João");

    }
}
