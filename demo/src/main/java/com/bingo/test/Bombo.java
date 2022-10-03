package com.bingo.test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bombo {

    private static int MAX_VALUE=90;
    private Random random;

    private List<Bola> bolas;
    private List<Bola> extraidas = new ArrayList<>(MAX_VALUE);

    public void init() {
        for(int i = 1; i<= MAX_VALUE;i++){
            bolas.add(new Bola(i));
        }
    }

    public void shuffle() {
        this.random = new Random(Timestamp.valueOf(LocalDateTime.now()).getTime());
        Collections.shuffle(bolas,random);
    }

    public void play() {
    }


}
