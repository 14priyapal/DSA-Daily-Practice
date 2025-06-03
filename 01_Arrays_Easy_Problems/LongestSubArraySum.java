import java.util.*;
public class LongestSubArraySum{
        //brute force approach
        public static int longestSubArraySum(int nums[], int k){
                int maxLen = 0;
                for(int i=0; i<nums.length; i++){
                        int sum = 0;
                        for(int j=i; j<nums.length; j++){
                                sum += nums[j];
                                if(sum == k){
                                        //j-i+1 -> means the length between j and i
                                        maxLen = Math.max(maxLen, j-i+1);
                                }
                        }

                }

                return maxLen;
        }

        //optimize one
        public static int longestSubarrayOptimalAny(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
                        sum += arr[i];

                        if (sum == k) {
                        maxLen = i + 1;
                        }

                        if (map.containsKey(sum - k)) {
                        maxLen = Math.max(maxLen, i - map.get(sum - k));
                        }

                        // Store only first occurrence
                        if (!map.containsKey(sum)) {
                        map.put(sum, i);
                        }
               }
               return maxLen;
        }

        public static void main(String args[]){
                int nums[] = {1,2,4,8,9,1,2,1,1,4,5};
                int k = 4;
                System.out.println(longestSubArraySum(nums, k));
        }
}
