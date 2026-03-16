package Module9;

import java.util.ArrayList;
import java.util.List;

//5 LeetCode 22 – Generate Parentheses (Medium)
public class Solution5 {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current,
                           int open, int close, int n){

        if(current.length() == n * 2){
            result.add(current);
            return;
        }

        if(open < n){
            backtrack(result, current + "(", open + 1, close, n);
        }

        if(close < open){
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}
