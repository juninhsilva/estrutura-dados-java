package com.juninhsilva.dio.java.estruturasdedados.referencia;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 1;
        int b = a;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        a = 2;
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        Objeto objetoA = new Objeto();
        //objetoA.setNum(99);
        System.out.println(objetoA.toString());

        Objeto objetoB = new Objeto();
        objetoB.setNum(16);
        System.out.println(objetoB.toString());

        objetoA = objetoB;

        System.out.println(objetoA.toString());
    }

}
