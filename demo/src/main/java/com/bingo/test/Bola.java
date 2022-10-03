package com.bingo.test;

public class Bola {

    private int value;
    private boolean selected;

    public Bola (int value){
        this.value=value;
        this.selected=false;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getValue() {
        return value;
    }

    public boolean isSelected() {
        return selected;
    }
    
}
