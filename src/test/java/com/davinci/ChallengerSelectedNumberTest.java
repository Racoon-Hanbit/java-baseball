package com.davinci;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChallengerSelectedNumberTest {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    @Test
    public void selectChallengerNumber() throws Exception{
        String input = "12@";
        System.out.println(Challenger.getChallengerSelectedNumber(input));
    }
}
