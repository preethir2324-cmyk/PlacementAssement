package Module04.AdvancedJava.Final;

final class FinalClass {
    final int value = 10;

    final void display() {
        System.out.println("Final Method. Value = " + value);
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
