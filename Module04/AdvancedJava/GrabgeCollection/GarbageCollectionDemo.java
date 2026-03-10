package Module04.AdvancedJava.GrabgeCollection;

public class GarbageCollectionDemo {

    public  void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
