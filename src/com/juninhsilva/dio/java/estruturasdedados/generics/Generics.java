package com.juninhsilva.dio.java.estruturasdedados.generics;

import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<Integer>();
        lista.setT(20);
        System.out.println(lista.getT());
    }
}
