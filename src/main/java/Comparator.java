/*
 * Comparator
 * version 1.0
 * 2020.10.22
 * Copyright (c) by Davinci.J
 */

/**
 * Comparator 클래스는 상대선수(컴퓨터)의 숫자와 도전자의 숫자를 비교하여 결과를 출력한다.
 * @author Davinci.J
 */

public class Comparator {
    /**
     * 상대선수(컴퓨터)의 숫자와 도전자의 숫자를 입력 파라미터로 받아 getStrikeCount 함수로
     * 스트라이크의 개수를 구하고 getBallCount 함수로 볼의 개수를 구한다.
     * 구한다. 스트라이크 개수와 볼의 개수를 getResult 함수의 매개 변수로 넣어 결과값을 출력한다.
     * @param OpponentPlayerNumbers 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @param ChallengerNumbers 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @return OpponentPlayerNumbers, ChallengerNumbers 의 문자열 중 어느 것도 일치 하지 않을 경우,
     * FourBall 출력. 같은 자리면서 숫자가 일치할 경우 1strike, 자리는 다른데 숫자만 일치할 경우 1ball,
     * 같은 자리에 숫자가 일치하는 것도 있고 자리는 다른데 숫자만 일치하는 것도 있는 경우 1strike 1ball
     * 형식으로 출력.
     */
    public static String compareNumbers(String OpponentPlayerNumbers, String ChallengerNumbers){
        int strikeCount = getStrikeCount(OpponentPlayerNumbers, ChallengerNumbers);
        int ballCount = getBallCount(OpponentPlayerNumbers, ChallengerNumbers);
        return getResult(strikeCount, ballCount);
    }

    /**
     * OpponentPlayerNumbers, ChallengerNumbers 을 순회하며 같은 자리에 같은 숫자가 있는 개수를 출력
     * @param OpponentPlayerNumbers 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @param ChallengerNumbers 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @return 0 - 3 사이의 정수를 출력
     */
    private static int getStrikeCount(String OpponentPlayerNumbers, String ChallengerNumbers){
        int count = 0;
        for(int i=0; i<OpponentPlayerNumbers.length(); i++){
            if(OpponentPlayerNumbers.charAt(i) == ChallengerNumbers.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * OpponentPlayerNumbers, ChallengerNumbers 을 순회하며 다른 자리지만 같은 숫자가 있는 개수를 출력
     * @param OpponentPlayerNumbers 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @param ChallengerNumbers 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @return 0 - 3 사이의 정수를 출력
     */
    private static int getBallCount(String OpponentPlayerNumbers, String ChallengerNumbers){
        int count = 0;
        for(int i=0; i<OpponentPlayerNumbers.length(); i++){
            if(OpponentPlayerNumbers.charAt(i) != ChallengerNumbers.charAt(i)
                    && ChallengerNumbers.contains(OpponentPlayerNumbers.charAt(i) + "")) {
                count++;
            }
        }
        return count;
    }

    /**
     * 스트라이크 개수와 볼 개수를 활용하여 결과값 출력
     * @param strikeCount 0 - 3 사이의 정수
     * @param ballCount 0 - 3 사이의 정수
     * @return 같은 자리면서 숫자가 일치할 경우 1strike, 자리는 다른데 숫자만 일치할 경우 1ball,
     * 같은 자리에 숫자가 일치하는 것도 있고 자리는 다른데 숫자만 일치하는 것도 있는 경우
     * 1strike 1ball 형식으로 출력.
     */
    private static String getResult(int strikeCount, int ballCount){
        if(strikeCount == 0 && ballCount == 0) { return "FourBall"; }
        if(strikeCount == 0) { return ballCount + "ball"; }
        if(ballCount == 0) { return strikeCount + "strike"; }
        return strikeCount + "strike " + ballCount + "ball";
    }
}
