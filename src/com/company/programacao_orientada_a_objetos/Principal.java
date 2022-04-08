package com.company.programacao_orientada_a_objetos;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.cor = "Branco";
        meuCarro.anoDeFabricacao = 2011;

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
        seuCarro.cor = "Preto";
        seuCarro.anoDeFabricacao = 2010;

    }
}
