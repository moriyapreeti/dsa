import java.util.*;
import java.io.*;

class RotationMatrix{
    public static void rotationMatrix(int[][] arr){
        int m = arr.length;  //row
        int n = arr[0].length;  //column
  //transpose the 2D array       
        for(int i=0; i<m; i++){
            for(int j=i; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
//swap the left and rigth side
        for(int i=0; i<m; i++){
            int li = 0;
            int ri = n-1;
             while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
             }
        }
    }
    public static void main(String[] args){

    int[][] arr={{1,2,3,4},{6,7,8,9},{11,12,13,14},{16,17,18,19}};
    rotationMatrix(arr);
    for(var mat:arr){
        System.out.println(Arrays.toString(mat));
    } 
    }
    
}