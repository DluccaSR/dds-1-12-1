package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Cachorro;

public class Cachorro {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void sentar(){
        System.out.println("Eu, " + nome + ", vou sentar" );
    }
}
