package tasks_7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        sc.nextLine();
    }

    int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

