import java.util.LinkedHashSet;

public class OpponentPlayer {

    private LinkedHashSet<Integer> randomNumbers;

    public OpponentPlayer(){
        randomNumbers = new LinkedHashSet<>();
    }

    public String makeRandomNumbers(){
        while(randomNumbers.size() < 3){
            int randomNumber = (int) (Math.random() * 10);
            System.out.println(randomNumber + " ");
            randomNumbers.add(getCorrectRangeNumber(randomNumber)); // 1 - 9
        }
        return getRandomNumbers();
    }

    private int getCorrectRangeNumber(int randomNumber){
        while(randomNumber == 0){
            randomNumber = (int) (Math.random() * 10);
        }
        return randomNumber;
    }

    private String getRandomNumbers(){
        StringBuffer numbers = new StringBuffer();
        for(Integer number : randomNumbers){
            numbers.append(number);
        }
        return numbers.toString();
    }

}
