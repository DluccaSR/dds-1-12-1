package com.company.Metodos;

import java.util.Scanner;

//identifique o outro trecho que poderia ser reaproveitado através do uso de métodos.
//        Crie um segundo método no algoritmo.

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};
        System.out.println("Escolha dentre os cursos abaixo: ");
        exibirUmFor(cursos);
        imprimirTraco();
        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = 0;
       // posicaoCursoEscolhido += escanearTeclado();
        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
        if (!posicaoValida) {
            encerrarProgramacaoPorCausaDePosicaoInvalida();
        }
        String[] formasPagamento = new String[]{"Cartão", "Boleto"};
        System.out.println("Escolha dentre as formas de pagamento abaixo: ");
        exibirUmFor(formasPagamento);
        imprimirTraco();
        System.out.print("Sua forma de pagamento escolhida é: ");
        int formaDePagaementoEscolida = 0;
        escanearTeclado();
        posicaoValida = formaDePagaementoEscolida >= 0 && formaDePagaementoEscolida < formasPagamento.length;
        if (!posicaoValida) {
            encerrarProgramacaoPorCausaDePosicaoInvalida();
        }
        imprimirTraco();
        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[formaDePagaementoEscolida];
        System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
        scanner.close();
    }
    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
    }
    static void escanearTeclado(){
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }
    static void exibirUmFor (String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + (i +1) + "]" + vetor[i]);
        }
    }
    static void encerrarProgramacaoPorCausaDePosicaoInvalida() {
        System.err.println("Posicao Invalida");
        System.exit(1);
    }
}




