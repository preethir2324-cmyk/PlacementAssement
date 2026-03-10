package Module04.AdvancedJava.String;
public class StringDemo {
    public static void main(String[] args) {

        // String (Immutable)
        String s = "Hello";
        s = s + " World";
        System.out.println("String: " + s);

        // StringBuilder (Mutable, Not Thread-Safe)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer (Mutable, Thread-Safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);
    }
}