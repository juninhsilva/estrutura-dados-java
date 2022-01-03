package com.juninhsilva.dio.java.estruturasdedados.fila;

public class Fila<T> {
    No<T> entrada;

    public Fila(){
        this.entrada = null;
    }

    public No<T> top(){
        return entrada;
    }

    public No<T> first(){
        if(!isEmpty()){
            No<T> primeiro = entrada;
            while(true){
                if(primeiro.getProximo() != null){
                    primeiro = primeiro.getProximo();
                }else break;
            }
            return primeiro;
        }
        return null;
    }

    public No<T> dequeue(){
        if(!isEmpty()){
            No<T> primeiro = entrada;
            No<T> aux = entrada;
            while(true){
                if(primeiro.getProximo() != null){
                    aux = primeiro;
                    primeiro = primeiro.getProximo();
                }else {
                    aux.setProximo(null);
                    break;
                }
            }


            return primeiro;
        }
        return null;
    }

    public void enqueue(No<T> novo){
        novo.setProximo(entrada);
        entrada = novo;
    }

    public boolean isEmpty(){
        return entrada == null;
    }

    @Override
    public String toString() {
        return "Pilha{}";
    }
}
