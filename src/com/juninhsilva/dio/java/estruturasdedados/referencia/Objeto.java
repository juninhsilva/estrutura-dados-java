package com.juninhsilva.dio.java.estruturasdedados.referencia;

public class Objeto {
    Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "num=" + num +
                '}';
    }
}
