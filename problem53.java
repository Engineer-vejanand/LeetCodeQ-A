import java.util.Scanner;

class Solution{
    public int maxSubArray(int[] nums) {
        int currentsum = 0;
        int maxsum = nums[0];

        for(int i=0; i<nums.length;i++){
            currentsum += nums[i];
            
            if(maxsum<currentsum){
                maxsum = currentsum;
            }
            
            if(currentsum < 0){
                currentsum = 0;
            }
    
        }

        return maxsum;
    }
}

public class problem53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("enter array length");
        int length = sc.nextInt();

        int nums[] = new int[length];

        for(int i=0;i<length;i++) {
            nums[i] = sc.nextInt();
        }

        int solve = solution.maxSubArray(nums);
        System.out.println(solve);
    }
}
