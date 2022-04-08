package com.company.leitura_e_escrita_de_dados_em_arquivos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio01Tarefas {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();
        int i = 0;
        while (true) {
            System.out.print("Tarefas " + i + ": " );
            String tarefas = scanner.nextLine();
            if ("x".equals(tarefas)){
                break;
            }
            linhas.add(tarefas);
            i++;
        }
        escreverNoArquivo("C:\\Users\\aluno.LABCETEC\\Desktop\\tarefas.txt", linhas);
        scanner.close();
        System.out.println("Fim...");
    }
    private static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
        Path path = Paths.get(arquivo);{
            Files.write(path, linhas);
        }
    }
}
