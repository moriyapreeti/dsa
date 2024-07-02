import java.util.*;
import java.io.*;
public class PrefixSumApproach{
    public static int findSumMatrix(int[][] arr , int r1, int c1, int r2, int c2){
        int sum =0;
        for(int i=r1; i<=r2; i++){
            for( int j=c1; j<=c2; j++){
                sum += arr[i][j];

            }
        }
    
        return sum;}
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of Row: ");
            int m = sc.nextInt();

            System.out.print("Enter number of Column: ");
            int n = sc.nextInt();
            int arr[][] = new int[m][n];

            System.out.println("enter the matrix element: ");
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] =sc.nextInt();
                }
            }

            int r1,c1,r2,c2;
            System.out.println("Enetr the value of r1 coordinate : ");
            r1 = sc.nextInt();

            System.out.println("Enetr the value of c1 coordinate : ");
            c1 = sc.nextInt();

            System.out.println("Enetr the value of r2 coordinate : ");
            r2 = sc.nextInt();

            System.out.println("Enetr the value of c2 coordinate : ");
            c2 = sc.nextInt();

            int result = findSumMatrix(arr, r1, c1, r2, c2);
            System.out.println("Sum of element of given Rectangle is: "+result);

            


        }
    }

