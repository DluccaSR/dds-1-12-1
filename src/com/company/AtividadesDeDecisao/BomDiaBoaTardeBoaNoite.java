package com.company.AtividadesDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class BomDiaBoaTardeBoaNoite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite qual turno voce estuda \n [M para Matutino] \n [V para Vespertino] \n [N para Noturno] \n : ");
        String periodoQueEstuda = scanner.nextLine();

        if (Objects.equals(periodoQueEstuda, "M,") || (Objects.equals(periodoQueEstuda, "m"))) {
            System.out.print("Bom Dia!");
        } else if (Objects.equals(periodoQueEstuda, "V") || (Objects.equals(periodoQueEstuda, "v"))) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.print("Indefinido");
        }
            scanner.close();
    }
}

