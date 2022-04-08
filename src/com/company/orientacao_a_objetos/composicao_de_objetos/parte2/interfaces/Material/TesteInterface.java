package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.interfaces.Material;

public class TesteInterface {
    public static void main(String[] args) {
        Imprimivel i = new NotaFiscal(1234);
        i.imprimir();
        EnviavelPorEmail e = (EnviavelPorEmail) i;
        e.enviar("luandluccaramalho@gmail.com");
        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("Caixa de Leite");
    }
}
