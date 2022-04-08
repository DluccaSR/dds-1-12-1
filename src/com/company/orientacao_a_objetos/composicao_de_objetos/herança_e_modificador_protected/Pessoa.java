package com.company.orientacao_a_objetos.composicao_de_objetos.herança_e_modificador_protected;

public class Pessoa {
    String nome;
    protected int idade;
    public void seApresentar(){
        System.out.println("Olá, eu sou " + nome + ", e tenho " + idade + "anos");
    }
}
