package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Exercicio;

public class RelatorioContas extends Conta {
    public void exibirListagem(Conta[] contas) {
        for (int i = 0; i < contas.length;i++){
           System.out.print("Conta: " + contas[i].getDescricao() +
                   "\npaga no valor de: R$" + contas[i].getValor() +
                   "\nData de venciemnto: " + contas[i].getDataVencimento() +
                   "\n==============================================================\n");

        }
    }
}
