import java.util.HashSet;

public class Challenger {

    private String challengerSelectedNumber;

    public Challenger(String challengerSelectedNumber) throws Exception {
        if(!isRightInput(challengerSelectedNumber)){
            throw new Exception("try again!!!");
        }
        this.challengerSelectedNumber = challengerSelectedNumber;
    }

    private boolean isRightInput(String challengerSelectedNumber){
        return isAllNumber(challengerSelectedNumber)
                && isNotRepeatedNumber(challengerSelectedNumber);
    }

    private boolean isAllNumber(String challengerSelectedNumber){
        for(int i=0; i<challengerSelectedNumber.length(); i++){
            if(challengerSelectedNumber.charAt(i) < '1'
                    || challengerSelectedNumber.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    private boolean isNotRepeatedNumber(String challengerSelectedNumber){
        HashSet<Character> repeatChecker = new HashSet<>();
        for(int i=0; i<challengerSelectedNumber.length(); i++){
            repeatChecker.add(challengerSelectedNumber.charAt(i));
        }
        return repeatChecker.size() == 3;
    }

    public String getChallengerSelectedNumber(){
        return challengerSelectedNumber;
    }

}