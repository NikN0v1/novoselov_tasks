package tasks_2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int n;
        int m;
        String[][] inputData;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        n = sc.nextInt();
        System.out.println("Введите m");
        m = sc.nextInt();
        inputData = new String[n][m];
        for (int i = 0; i < inputData.length; i++) {
            char[] in = sc.nextLine().toCharArray();
            for (int j = 0; j < inputData[i].length; j++) {
                inputData[i][j] = sc.nextLine();
            }
        }
        System.out.println(inputData[n][m]);
    }
}
