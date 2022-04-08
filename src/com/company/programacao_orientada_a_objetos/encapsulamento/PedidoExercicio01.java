package com.company.programacao_orientada_a_objetos.encapsulamento;

public class PedidoExercicio01 {
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos();
        pedido.codigo = 10110;
        pedido.desconto = 10.0;
        pedido.subtotal = 750.0;
        pedido.total = 0.00;
        System.out.println("Codigo do produto: " + pedido.getCodigo());
        System.out.println("Seu desconto e de: " + pedido.getDesconto() + "%");
        System.out.println("O Subtotal e de: R$" + pedido.getSubtotal());
        System.out.println("Total do produto com desconto: " + pedido.getTotal() + "R$" );
    }
}
