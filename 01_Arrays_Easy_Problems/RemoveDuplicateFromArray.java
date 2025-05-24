/*
Remove duplicate elements from a sorted array in-place using the two-pointer approach.

In-Place Algorithm:
- Does not use extra space except a few variables (O(1) space).
- Modifies the input array directly.

Two-Pointer Approach Logic:
1. Use two pointers:
   - `i` points to the index of the last unique element found.
   - `j` scans through the array starting from the second element.
2. Compare elements at `j` and `i`.
3. If nums[j] is different from nums[i], it means nums[j] is a new unique element.
   - Move `i` forward and copy nums[j] to nums[i+1].
4. If nums[j] is the same as nums[i], skip it (duplicate).
5. After the loop, the first `i+1` elements in the array are unique.
6. Return `i+1` as the count of unique elements.

Remember:  
"Slow pointer `i` tracks last unique, fast pointer `j` explores new elements. Copy new uniques forward, skip duplicates."
*/


public class RemoveDuplicateFromArray{
        public static int removeDuplicate(int nums[]){
                int i = 0;
                for(int j=1; j<nums.length; j++){
                        if(nums[j] != nums[i]){
                                nums[i+1] = nums[j];
                                i++;
                        }
                }
                return i+1;
        }
        public static void main(String args[]){
                int nums[] = {2,2,4,5,7,7};
                System.out.println(removeDuplicate(nums));
        }
}
