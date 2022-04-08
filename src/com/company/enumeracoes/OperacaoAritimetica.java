package com.company.enumeracoes;

public enum OperacaoAritimetica {
    ADICAO{
        public int operacao(int x, int y) {
            return x + y;
        }
    }, SUBTRACAO{
        public int operacao(int y, int x){
            return x - y;
        }
    };

    public abstract int operacao(int x, int y);
}