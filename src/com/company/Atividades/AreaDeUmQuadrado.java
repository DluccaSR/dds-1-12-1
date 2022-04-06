package com.company.Atividades;

import java.util.Scanner;

public class AreaDeUmQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o um numero para area do quadrado");
        Double Lado = scanner.nextDouble();
        Double area = Lado * Lado;
        int dobro = 2;
        Double areaAoQuadrado = area * dobro;

        System.out.print("Seu resultado é;" + areaAoQuadrado);
        scanner.close();

    }
}
