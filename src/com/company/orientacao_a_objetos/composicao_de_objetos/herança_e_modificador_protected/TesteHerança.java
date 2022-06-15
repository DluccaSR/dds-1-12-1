package com.company.orientacao_a_objetos.composicao_de_objetos.herança_e_modificador_protected;

public class TesteHerança {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.nome = "Jp";
        jogador.idade = 19;
        jogador.seApresentar();
        jogador.dizerSeAindaJoga();

    }
}
