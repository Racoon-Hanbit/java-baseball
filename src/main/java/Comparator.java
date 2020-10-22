public class Comparator {

    public static String compareNumbers(String OpponentPlayerNumbers, String ChallengerNumbers){
        int strikeCount = getStrikeCount(OpponentPlayerNumbers, ChallengerNumbers);
        int ballCount = getBallCount(OpponentPlayerNumbers, ChallengerNumbers);
        return getResult(strikeCount, ballCount);
    }

    private static int getStrikeCount(String OpponentPlayerNumbers, String ChallengerNumbers){
        int count = 0;
        for(int i=0; i<OpponentPlayerNumbers.length(); i++){
            if(OpponentPlayerNumbers.charAt(i) == ChallengerNumbers.charAt(i)) count++;
        }
        return count;
    }

    private static int getBallCount(String OpponentPlayerNumbers, String ChallengerNumbers){
        int count = 0;
        for(int i=0; i<OpponentPlayerNumbers.length(); i++){
            if(OpponentPlayerNumbers.charAt(i) != ChallengerNumbers.charAt(i)
                    && ChallengerNumbers.contains(OpponentPlayerNumbers.charAt(i) + "")) count++;
        }
        return count;
    }

    private static String getResult(int strikeCount, int ballCount){
        if(strikeCount == 0 && ballCount == 0) return "FourBall";
        if(strikeCount == 0) return ballCount + "ball";
        if(ballCount == 0) return strikeCount + "strike";
        return strikeCount + "strike " + ballCount + "ball";
    }
}
