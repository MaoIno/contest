/**
 * @avthor MaoIno
 * @data 2022/10/23
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        int s=solution.maxSubArray(test);
        System.out.println(s);
        System.out.println("over");
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
		int num = 1;
        int maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
