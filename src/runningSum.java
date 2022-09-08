public class runningSum {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        for (int i :intSums(nums)) {
            System.out.println(i);
        }
    }
    public static int[] intSums(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
