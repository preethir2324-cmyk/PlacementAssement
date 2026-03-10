package Exception.CheckedUncheck;

import java.io.*;

public class CheckedUncheckedDemo {
    public static void main(String[] args) {

        // Checked Exception (Compile-time)
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception handled: " + e);
        }

        // Unchecked Exception (Runtime)
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception handled: " + e);
        }
    }
}
