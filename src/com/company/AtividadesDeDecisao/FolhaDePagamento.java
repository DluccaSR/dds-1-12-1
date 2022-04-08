package com.company.AtividadesDeDecisao;

import java.util.Objects;
import java.util.Scanner;


public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra para um dia de semana:" +
                " \n [S - Segunda]" +
                " \n [T - Terça]\n [Qa - Quarta]\n [Qi - Quinta]\n [Sx - Sexta ]" +
                " \n [Sb - Sabado] \n [D - Domingo]" );
        String dia = scanner.nextLine();
        String diaDaSemana = null;
        switch (dia){
            case "S":
                diaDaSemana = "Segunda";
            case "T":
                System.out.println("Terça");
            case "Qa":
                System.out.println("Quarta");
            case "Qi":
                System.out.println("Quinta");
            case "Sex":
                System.out.println("Sexta");
            case "Sab":
                System.out.println("Sabado");
            case "D":
                System.out.println("Domingo");
        }
        System.out.println(diaDaSemana);
    }
}
