package com.company.AtividadesDeDecisao.Switch;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero para representar um dia: ");
        Integer dia = scanner.nextInt();
        String diaDaSemana = null;
        switch (dia) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-Feira";
                break;
            case 3:
                diaDaSemana = "Terça-Feira";
                break;
            case 4:
                diaDaSemana = "Quarta-Feira";
                break;
            case 5:
                diaDaSemana = "Quinta-Feira";
                break;
            case 6:
                diaDaSemana = "Sexta-Feira";
                break;
            case 7:
                diaDaSemana = "Sabado";
                break;
            default:
                System.err.println("Digite um numero válido!");
                System.exit(1);
        }
        System.out.println("Seu dia é: " + diaDaSemana);
    }
}
