//this is problem 118 of leetcode 
//pascal's triangle
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0; i<numRows ;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if(i > 0){
                List<Integer> prev = triangle.get(i-1);
                for(int j=1;j<i;j++){
                    row.add(prev.get(j-1)+prev.get(j));
                }
                row.add(1);
            }
            triangle.add(row);
        }


        return triangle;
    }
}



public class problem118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numrows = sc.nextInt();

        Solution solution = new Solution();
        List<List<Integer>> arr = solution.generate(numrows);

        System.out.println(arr);
    }
}
