package com.company.operadores;

import java.util.Scanner;

public class Exercicio06 {
    final static Double OITENTA_POR_CENTO = 0.8;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a meta de faturamento anual: ");
        double metaAnual = scanner.nextDouble();
        System.out.print("Digite qual foi o faturamento do ano anterior: ");
        double faturamentoReal = scanner.nextDouble();
        System.out.print("Digite a media salarial: ");
        double mediaSalarial = scanner.nextDouble();
        double oitentaPorCentoDaMeta = metaAnual * OITENTA_POR_CENTO;
        Boolean aMetaFoiBatida = faturamentoReal >= metaAnual;
        Boolean faturouPeloMenosOitanta = faturamentoReal >= oitentaPorCentoDaMeta;
        if (aMetaFoiBatida){
            System.out.print("Ganhara um bonus de que sera igual a media salarial: " + mediaSalarial );
        } else if (faturouPeloMenosOitanta) {
            double oitentaPorCentoDaMediaSalarial = mediaSalarial * OITENTA_POR_CENTO;
            System.out.print("Ganhara um bonus na media salarial: " + oitentaPorCentoDaMediaSalarial );
        }else {
            System.out.println("Nao ganhara bonus");
        }
    }
}
