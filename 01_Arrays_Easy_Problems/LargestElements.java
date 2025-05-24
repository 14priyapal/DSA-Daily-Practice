public class LargestElements{
    public static int findLargest(int arr[]){
        int maxValue = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,7,8,10};
        System.out.println("Largest element in this array is : " + findLargest(numbers));
    }
}
