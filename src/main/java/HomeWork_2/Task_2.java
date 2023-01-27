package HomeWork_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task_2 {
    public static void main(String[] args) {
        writeToAFile(textHundredTimes());
    }

    private static StringBuilder textHundredTimes() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST ");
        }
        return sb;
    }

    private static void writeToAFile(StringBuilder sb) {
        try (PrintWriter pw = new PrintWriter("src/main/java/HomeWork_2/HW_2Test.txt")) {
            pw.print(sb);
            System.out.println("Data has been successfully recorded!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}