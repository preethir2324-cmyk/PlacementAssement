package Module6;

public class PartitionArray {

    public static void main(String[] args) {

        int[] arr = {3, -2, -5, 6, -1, 4};
        int left = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}