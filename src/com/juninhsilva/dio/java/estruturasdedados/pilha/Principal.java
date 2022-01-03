package com.juninhsilva.dio.java.estruturasdedados.pilha;

public class Principal {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        pilha.push(new No<Integer>(1));
        pilha.push(new No<Integer>(2));
        pilha.push(new No<Integer>(3));
        pilha.push(new No<Integer>(4));
        pilha.push(new No<Integer>(5));
        pilha.push(new No<Integer>(6));

        System.out.println(pilha);
    }
}
