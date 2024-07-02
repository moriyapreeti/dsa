public class ReversalArr{
    public static void main(String[] args) {
        int arr[] ={1,4,7,8,18,19};
        int n = arr.length;
         for(int i = 0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
             }

        System.out.print("reversal array :- ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println( );

        }
    }
