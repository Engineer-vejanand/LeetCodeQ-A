//problem 73 set matrix zeroes

import java.util.Arrays;
import java.util.Scanner;
//for bettter practice and handle leetcode make different class solution
class Solution{
    public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];

        
        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }

        for(int i=0;i<m;i++){
            if(row[i]){
                for(int j=0;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }

        for(int i=0; i<n; i++){
           if(column[i]){
             for(int j=0; j<m; j++){
                matrix[j][i]=0;
             }
           }
        }

    }
}

public class problem73 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int m=sc.nextInt();
        System.out.println("eneter number of columns:");
        int n=sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("eneter the matrix elements row by row:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Solution solution = new Solution();
        solution.setZeroes(matrix);

        System.out.println("updated matrix:");
        
        for(int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}