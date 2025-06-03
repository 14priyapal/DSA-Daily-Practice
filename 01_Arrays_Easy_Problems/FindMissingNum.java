import java.util.HashSet;
public class FindMissingNum{
        public static int findMissingNum(int[] nums){
                 // Using HashSet 
                  HashSet<Integer> set = new HashSet<>();

                  //add all array's elements to the set
                  for(int num : nums){
                        set.add(num);
                  }

                // check which element from 1 to n is missing
                for(int i=1; i<=nums.length; i++){
                        if(!set.contains(i)){
                                return i;
                        }
                }

                return -1;

        }

        // optimize approach
        public static int findMissingNumOptimize(int[] nums){
                int n = nums.length + 1; 
                int expectedSum = n * (n+1)/2;
                int actualSum = 0;

                for(int num: nums){
                        actualSum += num;
                }
                return expectedSum - actualSum;
        }

        public static void main(String args[]){
                int nums[] = {1,2,4,5};
                System.out.println(findMissingNum(nums));
                System.out.println(findMissingNumOptimize(nums));
                
        }
}
