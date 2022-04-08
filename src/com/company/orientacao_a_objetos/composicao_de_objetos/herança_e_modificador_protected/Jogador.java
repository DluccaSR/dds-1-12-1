package com.company.orientacao_a_objetos.composicao_de_objetos.herança_e_modificador_protected;

public class Jogador extends Pessoa {
    protected  boolean aindaJoga = false;

    public void dizerSeAindaJoga(){
        if (aindaJoga == false){
            System.out.println("Não, me aposentei");
        }
    }
}
