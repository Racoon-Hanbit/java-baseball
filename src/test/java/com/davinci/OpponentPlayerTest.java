package com.davinci;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OpponentPlayerTest {

    @Test
    public void makeRandomNumber(){
        OpponentPlayer opponentPlayer = new OpponentPlayer();
        String temp = opponentPlayer.makeRandomNumbers();
        boolean check = true;
        if(temp.length() < 3){
            check = false;
        }
        if(temp.contains("0")){
            check = false;
        }
        assertTrue(check);
    }
}
