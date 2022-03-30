package com.company.Atividades;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a area em metros a ser pintada: ");
        double areaASerPintada = scanner.nextDouble();
        byte litroPorMetro = 3;
        byte galaoGrande = 18;
        byte precoGalaoGrande = 80;
        double galaoPequeno = 3.6;
        double precoGalaoPequeno = 25;

        double coberturasDasLatas = litroPorMetro / areaASerPintada;
        double quantidadeDeLatasPequenas = coberturasDasLatas / galaoPequeno;
        double latasPequenasParaComprar = quantidadeDeLatasPequenas * galaoPequeno;
        double quantidadeDeLatasPequenasArredondadas = Math.ceil(latasPequenasParaComprar);
        double precoDasLatasPequenas = coberturasDasLatas * precoGalaoPequeno;

        double quantidadeDeLatasGrandes = coberturasDasLatas / galaoGrande;
        double latasGrandesParaComprar = quantidadeDeLatasGrandes * galaoGrande;
        double quantidadeDeLatasGrandesArredondadas = Math.ceil(latasGrandesParaComprar);
        double precoDasLatasGrandes = coberturasDasLatas * precoGalaoGrande;

        System.out.println("A quantidade de latas pequenas a serem compradas é: " + quantidadeDeLatasPequenasArredondadas );
        System.out.println("O preço se comprar latas pequenas e de: " + precoDasLatasPequenas );

        System.out.println("A quantidade de latas grandes a serem compradas é: " + quantidadeDeLatasGrandesArredondadas );
        System.out.println("O preço de latas grandes a serem compradas é: " + precoDasLatasGrandes );
        scanner.close();
    }
}
