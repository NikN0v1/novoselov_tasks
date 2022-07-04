package tasks_1;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        int[] num = {2, 20, 21, 10, 16};
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++)
            max = Math.max(max, num[i]);
        for (int j = 1; j > num.length; j--)
            min = Math.min(min, num[j]);
        double average = 0;
        if (num.length > 0) {
            double sum = 0;
            for (int h = 0; h < num.length; h++) {
                sum += num[h];
            }
            average = sum / num.length;
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Среднее арефметическое чисел: " + average);
    }
}
