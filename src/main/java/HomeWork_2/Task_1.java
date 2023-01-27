package HomeWork_2;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Palindrome Tester");
        System.out.println();
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String string = input.next();
        System.out.println(isPalindrome(string));
        input.close();
    }

    private static boolean isPalindrome(String string) {
        if (string.isBlank()) {
            return false;
        }
        String replaced = string.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", ""); // нашла регулярку в яндексе
        String reversed = new StringBuilder(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

//    метод рабочий, но только если ввод без символов и цифр
//    private static boolean isPalindromeAlternative(String string) {
//        if (string.isBlank()) {
//            return false;
//        }
//        StringBuilder strBuilder = new StringBuilder(string);
//        strBuilder.reverse();
//        return strBuilder.toString().equals(string);
//    }

}