package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;


public class BubbleSortTest {
    @Test
    public void TestSortMethod(){
        List<Comparable> input = new ArrayList<>();
        input.add(1);
        input.add(4);
        input.add(5);
        input.add(6);
        input.add(8);
        input.add(3);
        input.add(8);

        List<Comparable> result = new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(8);
        result.add(8);

        Assert.assertEquals(BubbleSort.sort(input), result );
    }

    @Test
    public void TestSortMethodWithDifferentTypes(){
        List<Comparable> input = new ArrayList<>();
        input.add(-9.3);
        input.add(0.2);
        input.add(4);
        input.add(0.1);
        input.add(5);
        input.add(9);

        List<Comparable> result = new ArrayList<>();
        result.add(-9.3);
        result.add(0.1);
        result.add(0.2);
        result.add(4);
        result.add(5);
        result.add(9);

        Assert.assertEquals(BubbleSort.sort(input), result );
    }

    @Test
    public void TestSortMethodOnEmptyList(){
        List<Comparable> input = new ArrayList<>();
        List<Comparable> result = new ArrayList<>();

        Assert.assertEquals(BubbleSort.sort(input), result );
    }

    @Test
    public void TestSortMethodWithNullElement(){
        List<Comparable> input = new ArrayList<>();
        input.add(null);
        input.add(5.0001);

        List<Comparable> result = new ArrayList<>();
        result.add(5.0001);

        Assert.assertEquals(BubbleSort.sort(input), result );
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void TestSortMethodOnNullArgument(){
        List<Comparable> input = null;

        BubbleSort.sort(input);
    }
}