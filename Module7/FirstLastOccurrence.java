package Module7;

public class FirstLastOccurrence {

    static int firstOccurrence(int arr[], int key) {

        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                result = mid;
                end = mid - 1;
            }
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return result;
    }

    static int lastOccurrence(int arr[], int key) {

        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                result = mid;
                start = mid + 1;
            }
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,2,2,3,4,5};

        System.out.println("First: " + firstOccurrence(arr,2));
        System.out.println("Last: " + lastOccurrence(arr,2));
    }
}