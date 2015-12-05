package se.cygni.datatjej.problems;

import org.junit.Assert;
import org.junit.Test;

public class TestSimpleProblems {
    public int avg(int[] numbers) {
        return sum(numbers) / numbers.length;
    }

    public int max(int[] numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public String reverse(final String s) {
        int length = s.length();
        String result = "";

        for (int i = 0; i < length; i++) {
            result += s.charAt(length - i - 1);
        }

        return result;
    }

    public int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    @Test
    public void test01_sumOfIntegerArray() {
        Assert.assertEquals(6, sum(new int[]{1, 2, 3}));
        Assert.assertEquals(10, sum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test02_averageOfIntegerArray() {
        Assert.assertEquals(4, avg(new int[]{2, 4, 6}));
        Assert.assertEquals(5, avg(new int[]{2, 4, 6, 8}));
    }

    @Test
    public void test03_maxInIntegerArray() {
        Assert.assertEquals(8, max(new int[]{2, 4, 8, 6}));
        Assert.assertEquals(12, max(new int[]{12, 4, 6, 8}));
    }

    @Test
    public void test04_reverseString() {
        Assert.assertEquals("dlrow olleH", reverse("Hello world"));
        Assert.assertEquals("DataTjej", reverse("jejTataD"));
    }
}
