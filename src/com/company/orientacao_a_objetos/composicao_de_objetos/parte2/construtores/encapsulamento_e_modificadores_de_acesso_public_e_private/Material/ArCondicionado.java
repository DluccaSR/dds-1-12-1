package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Material;

public class ArCondicionado {
    private int temperatura;
    public void trocarTemperatura(int temepratura){
        if (temepratura >= 17 && temepratura <= 25){
            this.temperatura = temepratura;
        }
    }
    public int obterTempertatura(){
        return temperatura;
    }
}
