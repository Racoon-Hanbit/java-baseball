import java.util.HashSet;

public class OpponentPlayer {

    HashSet<Integer> randomNumbers;

    public OpponentPlayer(){
        randomNumbers = new HashSet<>();
    }

    public void makeRandomNumbers(){
        while(randomNumbers.size() < 3){
            int randomNumber = (int) (Math.random() * 10);
            randomNumbers.add(getCorrectRangeNumber(randomNumber)); // 1 - 9
        }
    }

    public int getCorrectRangeNumber(int randomNumber){
        while(randomNumber != 0){
            randomNumber = (int) (Math.random() * 10);
        }
        return randomNumber;
    }

}
