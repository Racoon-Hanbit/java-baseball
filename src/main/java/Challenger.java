import java.util.HashSet;

public class Challenger {

    public static String getChallengerSelectedNumber(String challengerSelectedNumber)
            throws Exception{
        if(!isRightInput(challengerSelectedNumber)){
            throw new Exception("try again!!!");
        }
        return challengerSelectedNumber;
    }

    private static boolean isRightInput(String challengerSelectedNumber){
        return isAllNumber(challengerSelectedNumber)
                && isNotRepeatedNumber(challengerSelectedNumber);
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

    private static boolean isNotRepeatedNumber(String challengerSelectedNumber){
        HashSet<Character> repeatChecker = new HashSet<>();
        for(int i=0; i<challengerSelectedNumber.length(); i++){
            repeatChecker.add(challengerSelectedNumber.charAt(i));
        }
        return repeatChecker.size() == 3;
    }

}