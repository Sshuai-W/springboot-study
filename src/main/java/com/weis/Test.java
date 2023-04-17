package com.weis;

import java.util.Arrays;

/**
 * @ClassName Test
 * @Description TODO
 * @Author weis
 * @Date 2022/8/15 19:25
 * @Version
 */
public class Test {

    public static void main(String[] args) {
        String str = "pwwkew";
        int[] nums = {-1,2,-3,-2};
        System.out.println(maxProduct(nums));
        numSquares(12);
    }

    public static int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                int curMin = min;
                min = Math.min(min*nums[i],max*nums[i]);
                max = Math.max(curMin*nums[i],nums[i]);
            }else if(nums[i] > 0){
                min = Math.min(min*nums[i],nums[i]);
                max = Math.max(max*nums[i],nums[i]);
            }
            ans = Math.max(ans,max);
        }
        return ans;
    }

    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j*j <= i; j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]);
            }
        }
        return dp[n];
    }

}
