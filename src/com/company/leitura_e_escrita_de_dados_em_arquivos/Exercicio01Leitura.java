package com.company.leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio01Leitura {
    public static void main(String[] args) throws IOException {
        Path tarefas = Paths.get("C:\\Users\\aluno.LABCETEC\\Desktop\\Tarefas.txt");
        List<String> linhas = Files.readAllLines(tarefas);
        for (int i = 0; i < linhas.size(); i++){
            String nome = linhas.get(i);
            System.out.println("Tarefas " + i + ": " + nome);
        }
    }
}