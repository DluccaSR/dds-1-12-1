package com.company.Atividades;

import java.util.Scanner;

public class TintasPorMetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite em metros quadrados o tamanho da sua area: ");
        double areaParaSerPintada = scanner.nextDouble();
        int litroPorMetro = 3;
        int precoDaLata = 80;
        int quantidadeDeTintaPorLata = 18;
        double coberturaDaTinta = areaParaSerPintada / litroPorMetro;
        double quantidadeDeLatas = coberturaDaTinta / quantidadeDeTintaPorLata;
        double dinheiroASerGasto = quantidadeDeLatas * precoDaLata;
        double quantidadeDeLatasArredondadas = Math.ceil(quantidadeDeLatas);
        System.out.println("A quantidade de latas a serem compradas sao: " + quantidadeDeLatasArredondadas);
        System.out.print("A quantidade de dinheiro gasto vai ser :" + dinheiroASerGasto );
        scanner.close();
    }
}
