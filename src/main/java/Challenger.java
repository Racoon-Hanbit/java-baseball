/*
* Challenger
* version 1.0
* 2020.10.22
* Copyright (c) by Davinci.J
*/

import java.util.HashSet;

/**
 * Challenger 클래스는 도전자가 입력한 3개의 숫자가 1 - 9사이의 숫자이면서 중복이 되지 않도록
 * 검증하여 문자열로 출력한다.
 * @author Davinci.J
 */

public class Challenger {

    /**
     * getChallengerSelectedNumber()함수는 도전자가 입력한 문자열이 1 - 9 사이의 중복되지 않는
     * 숫자 3개로 이루어져 있는지 검증한다. 만약 검증 조건에 부합하지 않는 경우, try again 이라는
     * 메시지를 지닌 예외를 던진다. 조건에 부합하는 경우, 입력한 문자열을 리턴한다.
     * @param challengerSelectedNumber 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @return challengerSelectedNumber 를 리턴
     * @throws Exception challengerSelectedNumber 문자열이 1 - 9 사이의 숫자가 아니고 중복되고
     * 길이가 3이 아닐 경우 예외처리
     */
    public static String getChallengerSelectedNumber(String challengerSelectedNumber)
            throws Exception{
        if(!isRightInput(challengerSelectedNumber)){
            throw new Exception("try again!!!");
        }
        return challengerSelectedNumber;
    }

    /**
     * 도전자가 입력한 문자열이 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어져 있는지 검증
     * @param challengerSelectedNumber 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @return 문자열이 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어져 있으면 true,
     * 그렇지 않다면 false 리턴
     */
    private static boolean isRightInput(String challengerSelectedNumber){
        return isAllNumber(challengerSelectedNumber)
                && isNotRepeatedNumber(challengerSelectedNumber);
    }

    /**
     * 도전자가 입력한 문자열이 모두 숫자로 이루어져 있는지 검증
     * @param challengerSelectedNumber 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @return 문자열이 1 - 9사이의 숫자로 이루어져 있으면 true, 그렇지 않다면 false 리턴
     */
    private static boolean isAllNumber(String challengerSelectedNumber){
        for(int i=0; i<challengerSelectedNumber.length(); i++){
            if(challengerSelectedNumber.charAt(i) < '1'
                    || challengerSelectedNumber.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    /**
     * 도전자가 입력한 문자열이 중복되지 않은 3개의 문자로 이루어져 있는지 검증
     * @param challengerSelectedNumber 1 - 9 사이의 중복되지 않는 숫자 3개로 이루어진 문자열
     * @return 문자열이 중복되지 않는 3개의 문자로 이루어져 있으면 true, 그렇지 않다면 false 리턴
     */
    private static boolean isNotRepeatedNumber(String challengerSelectedNumber){
        HashSet<Character> repeatChecker = new HashSet<>();
        for(int i=0; i<challengerSelectedNumber.length(); i++){
            repeatChecker.add(challengerSelectedNumber.charAt(i));
        }
        return repeatChecker.size() == 3;
    }

}