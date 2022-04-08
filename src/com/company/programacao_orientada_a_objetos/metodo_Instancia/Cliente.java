package com.company.programacao_orientada_a_objetos.metodo_Instancia;

public class Cliente {

    String primeiroNome;

    String ultimoNome;

    String telefone;

    String email;

    public String obterNomeCompleto() {
         String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }

    public String ObterDDD() {
        String ddd = telefone.substring(0,2);
        return ddd;
    }

    public String obterEmail() {
        String emailObtido = email;
        return emailObtido;
    }
}
