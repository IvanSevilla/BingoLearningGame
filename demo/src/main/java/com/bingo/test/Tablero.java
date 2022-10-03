package com.bingo.test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Random;

public class Tablero {

    private Bombo bombo;
    private Util util;
    public void run() {
        boolean status = true;
        while(status){
            bombo.play();
        }
    }

    public void init() {
        this.bombo = new Bombo();
        bombo.init();
        bombo.shuffle();
    }

}
