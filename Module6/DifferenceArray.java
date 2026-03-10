package Module6;

public class DifferenceArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int n = arr.length;

        int[] diff = new int[n];

        diff[0] = arr[0];

        for(int i = 1; i < n; i++)
            diff[i] = arr[i] - arr[i-1];

        int l = 1;
        int r = 3;
        int val = 5;

        diff[l] += val;

        if(r + 1 < n)
            diff[r+1] -= val;

        int[] result = new int[n];

        result[0] = diff[0];

        for(int i = 1; i < n; i++)
            result[i] = result[i-1] + diff[i];

        for(int i : result)
            System.out.print(i + " ");
    }
}
