//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        nums = orderZeroes(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    static int[] orderZeroes(int[] nums){
        int snowball = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowball++;
            }
            else if (snowball > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowball]=t;
            }
        }



        return nums;
    }
}
