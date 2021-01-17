package selfStudy;

import java.util.Scanner;

public class PalindromeHW4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово или предложение для проверки на полиндром ");
        isPalindrome(sc.nextLine());

    }

    public static void isPalindrome(String string) {
        String s1 = string.toUpperCase().replaceAll(" ", "");
        StringBuffer s2 = new StringBuffer(s1).reverse();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println("Данное слово/фраза не является полиндромом");
                break;
            } else {
                System.out.println("Данная фраза/слово является полиндромом");
                break;
            }

        }
    }
}


