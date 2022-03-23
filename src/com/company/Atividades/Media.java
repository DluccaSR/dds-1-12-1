package com.company.Atividades;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        Double num1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        Double num2 = scanner.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        Double num3 = scanner.nextDouble();
        System.out.print("Digite sua quarta nota: ");
        Double num4 = scanner.nextDouble();
        int divisor = 4;

        Double somasDeNotas = num1 + num2 + num3 + num4;
        Double SomaDeNotasDivididoPorQuatro = somasDeNotas / divisor;
        System.out.print("sua media e: " + SomaDeNotasDivididoPorQuatro);
    }
}