package javaConcepts;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int i;
        for(i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("not a palindrome");
                break;
            }
        }
        if(i==n/2){
            System.out.println("palindrome");
        }
    }
}
