package com.juninhsilva.dio.java.estruturasdedados.encadeamento;

public class Encadeamento {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Nó 1");
        No<String> no2 = new No<>("Nó 2");
        No<String> no3 = new No<>("Nó 3");
        No<String> no4 = new No<>("Nó 4");

        no1.setProximo(no2);
        no2.setProximo(no3);
        no3.setProximo(no4);

        System.out.println(no1);
        System.out.println(no2);
        System.out.println(no3);
        System.out.println(no4);

        System.out.println(no1.getProximo());
    }
}
