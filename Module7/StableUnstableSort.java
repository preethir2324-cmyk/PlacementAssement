package Module7;


class Item {
    int value;
    String label;

    Item(int value, String label) {
        this.value = value;
        this.label = label;
    }
}

public class StableUnstableSort {

    static void insertionSort(Item arr[]) {

        for (int i = 1; i < arr.length; i++) {

            Item key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].value > key.value) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    static void selectionSort(Item arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j].value < arr[minIndex].value)
                    minIndex = j;
            }

            Item temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(Item arr[]) {
        for (Item item : arr)
            System.out.println(item.value + " " + item.label);
        System.out.println();
    }

    public static void main(String[] args) {

        Item arr1[] = {
                new Item(5,"A"),
                new Item(3,"B"),
                new Item(5,"C"),
                new Item(2,"D")
        };

        Item arr2[] = {
                new Item(5,"A"),
                new Item(3,"B"),
                new Item(5,"C"),
                new Item(2,"D")
        };

        System.out.println("Original Array");
        printArray(arr1);

        insertionSort(arr1);
        System.out.println("After Insertion Sort (Stable)");
        printArray(arr1);

        selectionSort(arr2);
        System.out.println("After Selection Sort (Unstable)");
        printArray(arr2);
    }
}