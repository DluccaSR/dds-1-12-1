package com.company.AtividadesDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class SeEMasculinoOuFeminino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu sexo, F para Feminino e M para Masculino ");
    String genero = scanner.nextLine();
    if (Objects.equals(genero, "F,")||(Objects.equals(genero, "f"))) {
        System.out.print("Seu genero é: Feminino " ); }
    else if (Objects.equals(genero,"M" )||(Objects.equals(genero, "m"))) {
        System.out.println( "Seu genero é: Masculino"); }
    else {
        System.out.println("Indefinido");
        }
    }
}

