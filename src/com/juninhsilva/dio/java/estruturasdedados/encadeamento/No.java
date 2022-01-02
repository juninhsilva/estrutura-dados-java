package com.juninhsilva.dio.java.estruturasdedados.encadeamento;

public class No {
    private String conteudo;
    private No proximo;

    public No(String conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public No getProximo() {
        return proximo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public void setConteudo(String conteudo) {
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
