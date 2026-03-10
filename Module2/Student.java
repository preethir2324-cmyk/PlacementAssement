package Method_Rumtime;

public class Student {
        String name;
        int age;
        Student() {
            name = "Unknown";
            age = 0;
        }
        // Parameterized constructor
        Student(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println(name + " " + age);
        }
    }

    class Main {
        public static void main(String[] args) {
            Student s1 = new Student("Pooja",50);
            Student s2 = new Student("Preethi", 20);

            s1.display();
            s2.display();
        }
    }

