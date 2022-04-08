package com.company.programacao_orientada_a_objetos.metodo_Instancia;

public class Metodo_Instancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Luan Dlucca";
        cliente.ultimoNome = "Santos Ramalho";
        cliente.telefone = "27999999999";
        cliente.email = "luanxxxxxxx@xxxxmail.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "Joao Silva";
        cliente2.ultimoNome = "Pereira";
        cliente2.telefone = "27988888888";

        System.out.println("Nome do cliente: " + cliente.obterNomeCompleto() + "\nDDD: "
                + cliente.ObterDDD() + "\nEmail: " + cliente.obterEmail() );

    }

}
