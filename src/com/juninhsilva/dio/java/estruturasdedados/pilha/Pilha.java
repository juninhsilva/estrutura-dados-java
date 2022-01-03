package com.juninhsilva.dio.java.estruturasdedados.pilha;

public class Pilha<T> {
    No<T> entrada;

    public Pilha(){
        this.entrada = null;
    }

    public No<T> top(){
        return entrada;
    }

    public No<T> pop(){
        if(!isEmpty()){
            No<T> auxiliar = entrada;
            entrada = entrada.getProximo();
            return auxiliar;
        }
        return null;
    }

    public void push(No<T> novo){
        No<T> auxiliar = entrada;
        entrada = novo;
        entrada.setProximo(auxiliar);
    }

    public boolean isEmpty(){
        return entrada == null;
    }

    @Override
    public String toString() {
        return "Pilha{}";
    }
}
