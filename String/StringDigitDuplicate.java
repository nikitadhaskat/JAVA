package StringCLasses;

import java.util.Scanner;

public class StringDigitDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] count = new int[256];  // For all ASCII characters

        System.out.print("Digits in the string: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count[ch]++;
            if (Character.isDigit(ch)) {
                System.out.print(ch + " ");
            }
        }

        System.out.println("\nDuplicate characters:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " - " + count[i] + " times");
            }
        }

        scanner.close();
    }
}
