package javaConcepts;

import java.util.Scanner;

public class CheckConstantAndVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = Character.toLowerCase(sc.nextLine().charAt(0));

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }
    }
}
