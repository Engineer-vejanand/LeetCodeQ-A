import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public void sortColors(int [] nums) {
        int low = 0;
        int mid =0;
        int high =nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

public class problem75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("enter array length:");
        int num = sc.nextInt();
        int[] nums = new int[num];

        for(int i=0; i<num;i++){
            nums[i] = sc.nextInt();
        }

        solution.sortColors(nums);

        System.out.println(Arrays.toString(nums));

    }
}
