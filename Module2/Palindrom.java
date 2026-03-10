package Method_Rumtime;
import java.util.Scanner;
public class Palindrom {
        static boolean isPalindrome(String str) {
            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            return str.equals(rev);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            if (isPalindrome(input))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }

