package com.davinci;/*
 * OpponentPlayer
 * version 1.0
 * 2020.10.22
 * Copyright (c) by Davinci.J
 */

import java.util.LinkedHashSet;

/**
 * OpponentPlayer 는 게임시작 혹은 재시작 시, 임의의 중복되지 않는 1 - 9사이의 숫자 3개를 출력한다.
 * @author Davinci.J
 */

public class OpponentPlayer {

    /**
     * 임의의 서로 다른 3개의 정수를 출력한다.
     * @return randomNumbers 에 저장된 서로 다른 3개의 정수를 문자열 형태로 리턴
     */
    public static String makeRandomNumbers(){
        LinkedHashSet<Integer> randomNumbers = new LinkedHashSet<>();
        while(randomNumbers.size() < 3){
            int randomNumber = (int) (Math.random() * 10);
            randomNumbers.add(getCorrectRangeNumber(randomNumber));
        }
        return getRandomNumbers(randomNumbers);
    }

    /**
     * 입력 파라미터가 1 - 9 사이의 숫자일 경우, 바로 출력한다. 만약에 0이 입력 파라미터로 들어올 경우,
     * 0이 아닌 임의의 1 - 9 사이의 정수가 randomNumber 에 저장 될 때까지 반복 후 출력한다.
     * @param randomNumber 0 - 9 사이의 정수
     * @return 1 - 9 사이의 숫자를 리턴
     */
    private static int getCorrectRangeNumber(int randomNumber){
        while(randomNumber == 0){
            randomNumber = (int) (Math.random() * 10);
        }
        return randomNumber;
    }

    /**
     * 서로 다른 3개의 정수를 갖고 있는 randomNumbers 로부터 값을 추출하여 문자열로 만들어 출력한다.
     * @param randomNumbers 서로 다른 3개의 정수(1 - 9)를 갖고 있는 자료구조
     * @return randomNumbers 에 저장된 3개의 정수를 문자열로 리턴
     */
    private static String getRandomNumbers(LinkedHashSet<Integer> randomNumbers){
        StringBuffer numbers = new StringBuffer();
        for(Integer number : randomNumbers){
            numbers.append(number);
        }
        return numbers.toString();
    }

}
