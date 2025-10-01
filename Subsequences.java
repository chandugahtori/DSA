import java.util.*;
public class Subsequences {

        public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            backtrack(0, nums, new ArrayList<>(), res);
            return res;
        }
        
        public static void backtrack(int index, int[] nums, List<Integer> curr, List<List<Integer>> res) {
            res.add(new ArrayList<>(curr)); 
            for (int i = index; i < nums.length; i++) {
                curr.add(nums[i]);                
                backtrack(i + 1, nums, curr, res); 
                curr.remove(curr.size() - 1);      
            }
        }
    
    public static void main(String[] args) {
        int nums[] = {2,1,3};
        System.out.println(subsets(nums));

    }
}
