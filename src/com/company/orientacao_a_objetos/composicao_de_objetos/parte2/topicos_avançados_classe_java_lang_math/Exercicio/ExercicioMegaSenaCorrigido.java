package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.topicos_avançados_classe_java_lang_math.Exercicio;

import java.util.Scanner;

public class ExercicioMegaSenaCorrigido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos jogos ?");
        int quantidadeDeJogos = scanner.nextInt();
        System.out.printf("---------------------------------");
        for (int i = 1; i < quantidadeDeJogos; i++){
            MegaSena mega = new MegaSena();
            mega.sortear();
            mega.exibirNumeros();
            System.out.printf("-----------");
            System.out.println("*** Boa Sorte! ***");
        }
    }
}
