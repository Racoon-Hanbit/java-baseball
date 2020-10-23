package com.davinci;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        String opponentPlayerNumbers = OpponentPlayer.makeRandomNumbers();
        while(true){
            try{
                System.out.println("컴퓨터 숫자: " + opponentPlayerNumbers);
                System.out.print("숫자를 입력해주세요: ");
                String challengerNumbers = Challenger.getChallengerSelectedNumber(br.readLine());
                String result = Comparator.compareNumbers(opponentPlayerNumbers, challengerNumbers);
                System.out.println(result);
                if(!isAllMatch(result)) continue;
                System.out.println("3개의 숫자를 모두 맞히셨습니다! " +
                        "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int restart = 1;
                int end = 2;
                int selectedMenu = endOrReStartGame(restart, end);
                if (selectedMenu == restart) {
                    opponentPlayerNumbers = OpponentPlayer.makeRandomNumbers();
                    continue;
                }
                if(selectedMenu == end){
                    return;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean isAllMatch(String result){
        return result.equals("3strike");
    }

    private static int endOrReStartGame(int restart, int end) throws Exception{
        while(true){
            String input = br.readLine();
            if(isCorrectNumber(input, restart, end)) {
                return Integer.parseInt(input);
            }
            System.out.println("1 또는 2가 아닙니다. 다시 입력하세요.");
        }
    }

    private static boolean isCorrectNumber(String input, int restart, int end){
        return isAllNumber(input) && isEndOrRestartNumber(input, restart, end);
    }

    private static boolean isAllNumber(String challengerSelectedNumber){
        for(int i=0; i<challengerSelectedNumber.length(); i++){
            if(challengerSelectedNumber.charAt(i) < '1'
                    || challengerSelectedNumber.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    private static boolean isEndOrRestartNumber(String input, int restart, int end){
        int convertedInput = Integer.parseInt(input);
        return convertedInput == restart || convertedInput == end;
    }
}
