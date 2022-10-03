package com.bingo.test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Collectors;

public class Bombo {

    public static int MAX_VALUE = 90;
    private static int ULTIMAS_BOLAS = 5;
    private Random random;

    private List<Bola> bolas;
    private Deque<Bola> bolasMezcladas;
    private List<Bola> extraidas = new ArrayList<>();
    private Deque<Bola> ultimos = new LinkedList<>() {

    };

    public void init() {
        bolas = new ArrayList<>();
        for (int i = 1; i <= MAX_VALUE; i++) {
            bolas.add(new Bola(i));
        }
    }

    public void shuffle() {
        this.random = new Random(Timestamp.valueOf(LocalDateTime.now()).getTime());
        Collections.shuffle(bolas, random);
        bolasMezcladas = new LinkedList<>(bolas);
    }

    public void play() {
        Bola extraida = bolasMezcladas.pop();
        extraida.setExtraida(true);
        extraidas.add(extraida);
        ultimos.push(extraida);
        if (ultimos.size() == ULTIMAS_BOLAS) {
            ultimos.pollLast();
        }
    }

    public String getUltimaBola() {
        return "La Ultima Bola es: " + ultimos.peek().getValue();
    }

    public List<Integer> getUltimos() {
        return ultimos.stream().map(Bola::getValue)
                .map(Integer.class::cast).collect(Collectors.toList());
    }

    public boolean isBolaExtraida(int i) {
        Optional<Bola> bola = extraidas.stream()
                .filter(b -> b.getValue() == i).findFirst();
        return bola.isPresent() ? bola.get().isExtraida() : false;
    }

}
