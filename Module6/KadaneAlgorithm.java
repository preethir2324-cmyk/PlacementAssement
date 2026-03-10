package Module6;

public class KadaneAlgorithm {

    static void main() {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSum = arr[0];
        int currentSum = arr[0];

        for(int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);

        }
        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}