package OOPS.Methodoverloading;

public class MathOp {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }
class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child method");
    }
}

class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
