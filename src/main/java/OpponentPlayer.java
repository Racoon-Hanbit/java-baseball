import java.util.LinkedHashSet;

public class OpponentPlayer {

    public static String makeRandomNumbers(){
        LinkedHashSet<Integer> randomNumbers = new LinkedHashSet<>();
        while(randomNumbers.size() < 3){
            int randomNumber = (int) (Math.random() * 10);
            randomNumbers.add(getCorrectRangeNumber(randomNumber));
        }
        return getRandomNumbers(randomNumbers);
    }

    private static int getCorrectRangeNumber(int randomNumber){
        while(randomNumber == 0){
            randomNumber = (int) (Math.random() * 10);
        }
        return randomNumber;
    }

    private static String getRandomNumbers(LinkedHashSet<Integer> randomNumbers){
        StringBuffer numbers = new StringBuffer();
        for(Integer number : randomNumbers){
            numbers.append(number);
        }
        return numbers.toString();
    }

}
