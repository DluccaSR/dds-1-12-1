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
        if (Objects.equals(dia, "S"));



    }
}
