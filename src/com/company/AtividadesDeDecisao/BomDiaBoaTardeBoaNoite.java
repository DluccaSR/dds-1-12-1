package com.company.AtividadesDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class BomDiaBoaTardeBoaNoite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite qual turno voce estuda \n [M para Matutino] \n [V para Vespertino] \n [N para Noturno] \n [D para o Dia inteiro} : ");
        String periodo = scanner.nextLine();


        if (Objects.equals(periodo, "M,")||(Objects.equals(periodo, "m"))) {
            System.out.print("Bom Dia!" ); }
        else if (Objects.equals(periodo,"V" )||(Objects.equals(periodo, "v"))) {
            System.out.println( "Boa Tarde!"); }
        else {
            System.out.print("Indefinido");
        }
    }
}
