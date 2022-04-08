package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.interfaces.Material;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail {
    private int numero;

    @Override
    public void imprimir() {
        System.out.println("Vamos imprimir essa nota fiscal de numero: " + numero );

    }

    public NotaFiscal(int numero) {
        this.numero = numero;
    }

    public void adicionarPedido(String produto) {

    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota de numero: " + numero + " para o email: " + email);
    }
}
