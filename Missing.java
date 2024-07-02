//time complexity O(n)
// space O(1)

public class Missing{
    public static void main(String[] args){
        int[] arr = {1,3,4,7,6,5};
        int n = arr.length;
        //sum of natural nmber.
        int sum_natural_num = ((n+1)*(n+2))/2;
        int sum = 0;
        //sum of natural nuber current present in the array
        for(int i =0; i<n; i++ ){
            sum+= arr[i];
        }
            int missing_elem = 0;
            missing_elem = sum_natural_num -sum;
            System.out.println("Missing in an array is : " +missing_elem);

        
    }
}