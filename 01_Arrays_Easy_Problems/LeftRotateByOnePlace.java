import java.util.ArrayList;
import java.util.Arrays;
public class LeftRotateByOnePlace{
        public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr){
                int temp = arr.get(0);

                for(int i=0; i<arr.size()-1; i++){
                        arr.set(i, arr.get(i+1));
                }
                arr.set(arr.size()-1, temp);
                return arr;
        }
        public static void main(String args[]){
                 int nums[] = {1, 2, 3, 4, 5};

               ArrayList<Integer> arr = new ArrayList<>();
               for(int num: nums){
                        arr.add(num);
               }

               
                System.out.println(rotateArray(arr));
        }
}
/*
Quick Revision Note – Left Rotation by One Place in Java
Concept:
In left rotation by one place, each element of the array shifts one position to the left.

The first element moves to the end.

Example:
Input:
[1, 2, 3, 4, 5]
Output after 1 left rotation:
[2, 3, 4, 5, 1]

Steps to Perform Left Rotation on ArrayList<Integer>:
1. Store the first element in a temporary variable.

2. Shift all elements one index to the left.

3. Place the first element at the end of the list.
*/
