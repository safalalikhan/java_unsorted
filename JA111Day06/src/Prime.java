import java.util.Arrays;

public class Prime {
    public int[] findAndReturnPrimeNumbers(int[] input){
        int n = input.length,count = 0;
        int[] arr = new int[n+1];
        for(int i = 0 ; i < n ; i ++){
           int f = 0;
           for(int j = 1 ; j <= input[i]/2; j ++){
               if(input[i]%j == 0 )f++;
           }
           if(f == 1){
               arr[count] = input[i];
               count++;
           }
        }

        return arr;

    }
    public static void main(String[] args){

        int[] arr = {10,12,5,50,11,14,15};
        Prime obj = new Prime();
        int[] a = obj.findAndReturnPrimeNumbers(arr);
if(a.length == 0 ) System.out.println("Prime number not found in the given array");
else System.out.println(Arrays.toString(a));
    }
}
