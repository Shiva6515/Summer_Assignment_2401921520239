// Problem Name : Maximum Average Subarray I
// Problem Link : https://leetcode.com/problems/maximum-average-subarray-i/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int subarraySum = 0;
        for(int i=0;i<k;i++){
            subarraySum += nums[i];
        }
        int maxSum = subarraySum;
        for(int i=k;i<n;i++){
            subarraySum = subarraySum + nums[i] - nums[i-k];
            maxSum = Math.max(subarraySum,maxSum);
        }
        double avg = (double)maxSum/k;
        return avg;
    }
}