package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.objeto_this;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    void alternarModelo(String modelo){
        if (modelo != null){
            this.modelo = modelo;
        }
    }
}
