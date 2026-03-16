package Module8;
//5 LeetCode 191 – Number of 1 Bits (Easy)
public class Solution4 {
    public int hammingWeight(int n) {
        int count = 0;

        while(n > 0){
            count += (n & 1);  // check last bit
            n = n >> 1;       // shift right
        }

        return count;

    }
}
