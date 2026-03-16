package Module9;

import java.util.ArrayList;
import java.util.List;

//2 LeetCode 46 – Permutations (Medium)
public class Solution2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(result, new ArrayList<>(), nums, used);

        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, boolean[] used) {

        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++){

            if(used[i]) continue;

            temp.add(nums[i]);
            used[i] = true;

            backtrack(result, temp, nums, used);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }

    }
}
