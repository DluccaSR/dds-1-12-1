package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.topicos_avançados_classe_java_lang_math.Exercicio;

import java.util.Scanner;
import static java.lang.Math.*;
public class Exercicio01MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de jogos que devem ser feitos: ");
        double jogosAseremFeitos = scanner.nextDouble();
        for (int i = 0; i < jogosAseremFeitos; ) {
            double numero1 = random() * 60;
            double numero2 = random() * 60;
            double numero3 = random() * 60;
            double numero4 = random() * 60;
            double numero5 = random() * 60;
            double numero6 = random() * 60;

            //double[] sequencia = new double[]{round(numero1), round(numero2), round(numero3), round(numero4), round(numero5), round(numero6)};
                System.out.println("Jogo " + (1 + i));
                System.out.println("Os numeros sorteados foram: " + round(numero1));
                System.out.println("Os numeros sorteados foram: " + round(numero2));
                System.out.println("Os numeros sorteados foram: " + round(numero3));
                System.out.println("Os numeros sorteados foram: " + round(numero4));
                System.out.println("Os numeros sorteados foram: " + round(numero5));
                System.out.println("Os numeros sorteados foram: " + round(numero6));
                System.out.println("====================================================");
                i++;
            }
        }
    }

/*
A Mega-Sena é o jogo que paga milhões de reais para o acertador dos números sorteados.
Em um jogo comum, os jogadores devem marcar 6 números entre os 60 disponíveis, sendo de 1 a 60.
Na empresa que você trabalha, o pessoal se juntou para fazer um bolão.
Um bolão acontece quando várias pessoas se unem para jogarem várias combinações de números em conjunto.
 Se algum jogo for contemplado, o valor do prêmio é dividido entre todos os participantes.
Como um bom programador, você sugeriu e se dispôs a desenvolver um pequeno software para gerar os números a serem marcados nos jogos.
 Todos concordaram, agora você tem um importante trabalho pela frente.
Faça um programa em Java que recebe como parâmetro do usuário a quantidade
 de jogos a serem feitos, gera e exibe na tela a sequência de números de cada jogo.
Use a classe Math para gerar números aleatórios e fazer arredondamentos.
 Lembre-se de verificar se não existem números repetidos em uma sequência, pois os 6 números devem ser únicos.
Se levar esse desafio a sério, jogar na Mega-Sena e ganhar, não esqueça de nós! ;)
 */
