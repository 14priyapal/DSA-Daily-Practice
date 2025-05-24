/*
One-pass scan:
  → Track two values: largest & second largest

📌 Logic:
  - Start with first element as 'largest', sLargest = -1
  - If current > largest → update both: sLargest = largest, largest = current
  - If current is between largest and sLargest → update sLargest only

No extra space, no sorting → O(n) time, O(1) space
"Compare → Update largest & second largest"

 Champion → largest
Runner-Up → second largest
One round of checking = O(n) time
No extra stage, no sorting = O(1) space
 */

public class SecondLargest{
        public static int findSecondLargest(int nums[]){
                int largest = nums[0];
                int sLargest = -1;

                for(int i=0; i<nums.length; i++){
                        if(nums[i] > largest){
                                sLargest = largest;
                                largest = nums[i];
                        }
                        else if(nums[i] < largest &&  nums[i] > sLargest){
                                sLargest = nums[i];
                        }
                }

                return sLargest;
        }

        public static void main(String args[]){
                int nums[] = {1,2,4,6,8,3,9,9,8};
                System.out.println("Second largest element is: " + findSecondLargest(nums));
        }
}
