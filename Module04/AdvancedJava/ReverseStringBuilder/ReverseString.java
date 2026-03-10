package Module04.AdvancedJava.ReverseStringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Programming";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + sb);
    }
}
