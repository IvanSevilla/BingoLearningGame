package com.bingo.test;

public class Bola {

    private int value;
    private boolean extraida;

    public Bola(int value) {
        this.value = value;
        this.extraida = false;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setExtraida(boolean extraida) {
        this.extraida = extraida;
    }

    public int getValue() {
        return value;
    }

    public boolean isExtraida() {
        return extraida;
    }

}
