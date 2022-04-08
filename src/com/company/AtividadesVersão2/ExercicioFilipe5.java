package com.company.AtividadesVersão2;

import java.util.Scanner;

public class ExercicioFilipe5 {
    static final Integer NOTA_QUE_PRECISA_PARA_PASSAR = 70;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIigite sua nota: ");
        double nota = scanner.nextDouble();
        boolean passouDeAno = nota > NOTA_QUE_PRECISA_PARA_PASSAR;
        if (passouDeAno){
            System.out.print("Parabens, voce passou de ano!");
        } else {
        System.out.print("Voce nao passou de ano, tente novamente ano que vem");
        }
    }
}
