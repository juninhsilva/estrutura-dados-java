package com.juninhsilva.dio.java.estruturasdedados.fila;

public class Principal {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enqueue(new No<Integer>(1));
        fila.enqueue(new No<Integer>(2));
        fila.enqueue(new No<Integer>(3));
        fila.enqueue(new No<Integer>(4));
        fila.enqueue(new No<Integer>(5));
        fila.enqueue(new No<Integer>(6));

        System.out.println(fila);
    }
}
