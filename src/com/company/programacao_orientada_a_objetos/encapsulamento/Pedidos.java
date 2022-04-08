package com.company.programacao_orientada_a_objetos.encapsulamento;

public class Pedidos {
    Integer codigo;
    Double subtotal;
    Double desconto;
    Double total;
    public Integer getCodigo() {
        return codigo;
    }
    public Double getSubtotal() {
        return subtotal;
    }
    public Double getDesconto() {
        return desconto;
    }
    public Double getTotal() {
        double pedidoTotalComDesconto  = subtotal * 0.1; // 0,1 e equivalente a 10%
        double pedidoTotal = subtotal - pedidoTotalComDesconto;
        return pedidoTotal;
    }
}
