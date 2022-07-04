package tasks_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String fileInput = new Scanner(System.in).nextLine();
        String fileOutput = new Scanner(System.in).nextLine();
         try (InputStream is = new FileInputStream(fileInput)) {
             byte[] buffer = new byte[is.available()];
             is.read(buffer);
             for (byte el : buffer) {
                 System.out.println((char) el);
             }
         } catch (FileNotFoundException e) {
             System.out.println("Файл не найден!");
         } catch (IOException e) {
             System.out.println("Ошика считывания данных!");
         }
    }
}
