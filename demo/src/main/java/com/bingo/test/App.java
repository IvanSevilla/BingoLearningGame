package com.bingo.test;

/**
 * Hello world!
 *
 */
public class App {
    private static Tablero tablero;

    public static void main(String[] args) {
        tablero = new Tablero();
        tablero.init();
        tablero.run();
    }
}
