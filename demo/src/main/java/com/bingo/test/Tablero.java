package com.bingo.test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tablero {

    private Bombo bombo;
    private int lastValue;

    public void init() {
        this.bombo = new Bombo();
        bombo.init();
        bombo.shuffle();
    }

    public void run() {
        boolean status = true;
        Scanner scanner = new Scanner(System.in);
        while (status) {
            mostrar("Introduce un valor :");
            mostrar("0 - Siguiente Bola");
            mostrar("1 - Salir del Juego");

            int resultado = scanner.nextInt();
            switch (resultado) {
                case 0:
                    bombo.play();
                    muestraBola();
                    muestraBolas();
                    break;
                case 2:
                    status = false;
                default:
                    break;

            }
        }
    }

    private void muestraBolas() {
        List<Integer> ultimos = bombo.getUltimos();
        StringBuilder bolasAMostrar = new StringBuilder();
        for (int i = 1; i <= Bombo.MAX_VALUE; i++) {
            if (ultimos.contains(i)) {
                bolasAMostrar.append("![" + i + "]!");
            } else {
                if (bombo.isBolaExtraida(i)) {
                    bolasAMostrar.append("[*" + i + "*]");
                } else {
                    bolasAMostrar.append("[" + i + "]");
                }
            }
            if (i % 9 == 0) {
                bolasAMostrar.append("\n");
            }
        }
        mostrar(bolasAMostrar.toString());
    }

    private void muestraBola() {
        mostrar(bombo.getUltimaBola());
    }

    private void mostrar(String valorAMostrar) {
        System.out.println(valorAMostrar);
    }

}
