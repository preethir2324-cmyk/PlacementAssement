package Module7;

public class SearchRotatedArray {

    static int search(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[start] <= arr[mid]) {

                if (key >= arr[start] && key < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {

                if (key > arr[mid] && key <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {4,5,6,7,0,1,2};

        System.out.println("Index: " + search(arr,0));
    }
}
