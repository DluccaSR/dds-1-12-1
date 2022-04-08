package com.company.orientacao_a_objetos.composicao_de_objetos.sobreposicao.sobrecarga;

public class CadastroPessoa {

    public void cadastro (Pessoa pessoa){
        armazenar(pessoa.getNome(), pessoa.getIdade());
    }

    public void  cadastrar(String nome, int idade){
        armazenar(nome, idade);
    }

    public void cadastrar(String nome){
        armazenar(nome, 0);
    }

    private void armazenar(String nome, int idade){
        System.out.println("Salvando: \"" + nome + "\" com " + idade + " anos.");
    }
}
