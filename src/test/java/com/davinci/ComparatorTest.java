package com.davinci;

import org.junit.Assert;
import org.junit.Test;

public class ComparatorTest {

    @Test
    public void given_148_287_then_1ball() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String opponentNumbers = "148";
        String challengerNumbers = "287";
        String expectedResultValue = "1ball";
        System.out.println("한글 출력 깨짐");

        //WHEN - 실제 로직 수행
        String actualResultValue = Comparator.compareNumbers(opponentNumbers, challengerNumbers);

        //THEN - 결과 비교
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_248_287_then_1strike_1ball() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String opponentNumbers = "248";
        String challengerNumbers = "287";
        String expectedResultValue = "1strike 1ball";

        //WHEN - 실제 로직 수행
        String actualResultValue = Comparator.compareNumbers(opponentNumbers, challengerNumbers);

        //THEN - 결과 비교
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_348_297_then_out() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String opponentNumbers = "348";
        String challengerNumbers = "297";
        String expectedResultValue = "FourBall";

        //WHEN - 실제 로직 수행
        String actualResultValue = Comparator.compareNumbers(opponentNumbers, challengerNumbers);

        //THEN - 결과 비교
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_325_325_then_3strike() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String opponentNumbers = "325";
        String challengerNumbers = "325";
        String expectedResultValue = "3strike";

        //WHEN - 실제 로직 수행
        String actualResultValue = Comparator.compareNumbers(opponentNumbers, challengerNumbers);

        //THEN - 결과 비교
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_325_235_then_1strike_2ball() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String opponentNumbers = "325";
        String challengerNumbers = "235";
        String expectedResultValue = "1strike 2ball";

        //WHEN - 실제 로직 수행
        String actualResultValue = Comparator.compareNumbers(opponentNumbers, challengerNumbers);

        //THEN - 결과 비교
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }
}
