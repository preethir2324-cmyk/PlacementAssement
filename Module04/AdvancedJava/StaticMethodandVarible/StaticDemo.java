package Module04.AdvancedJava.StaticMethodandVarible;
class Student {
    int rollNo;
    String name;
    static String college = "Sapthigiri  College";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void changeCollege() {
        college = "Sapthigiri College";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student.changeCollege();

        Student s1 = new Student(1, "Preethi");
        Student s2 = new Student(2, "Pooja");

        s1.display();
        s2.display();
    }
}
