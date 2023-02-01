package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BalancedWordsCounterTest {
    @Test
    public void TestCount() {
        String input = "aabbabcccba";
        int result = 28;

        Assert.assertEquals(BalancedWordsCounter.count(input), result);
    }

    @Test
    public void TestCountEmptyString(){
        String input = "";
        int result = 0;

        Assert.assertEquals(BalancedWordsCounter.count(input), result);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void TestCountStringWithOtherElementThanLetters(){
        String input = "abababa1";

        BalancedWordsCounter.count(input);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void TestCountNull(){
        String input = null;

        BalancedWordsCounter.count(input);
    }
}