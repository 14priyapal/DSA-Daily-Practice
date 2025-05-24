public class CheckArrayIsSort{
        public static boolean checkSort(int nums[]){
                for(int i=1; i<nums.length; i++){
                        if(nums[i] >= nums[i-1]){

                        }else{
                                return false;
                        }
                        
                }
                return true;
        }

        public static void main(String args[]){
                int nums[] = {2,4,6,2,7,0};

                System.out.println(checkSort(nums));
        }
}
