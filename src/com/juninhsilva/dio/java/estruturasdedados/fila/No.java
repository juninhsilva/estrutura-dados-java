package com.juninhsilva.dio.java.estruturasdedados.fila;

public class No<T>{
    private T conteudo;
    private No<T> proximo;

    public No(T conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                ", proximo=" + proximo +
                '}';
    }
}
