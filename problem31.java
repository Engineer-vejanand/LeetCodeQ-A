import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;

        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

public class problem31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("enter array length");
        int num = sc.nextInt();

        int nums[] = new int[num];

        for(int i=0; i<num;i++){
            nums[i] = sc.nextInt();
        }

        solution.nextPermutation(nums);

      
        System.out.println("Next permutation:");
        System.out.println(Arrays.toString(nums));
    }
}