package tasks_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String str = "А";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово, начинающееся на букву А");
        String word = sc.next();
        char first = word.charAt(0);

        if (str.indexOf('А') == 0) {
            System.out.println("Благодарю!");
        }else {
            System.out.println("Введите слово повторно");
        }
    }
}
