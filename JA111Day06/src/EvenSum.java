import java.util.Arrays;
import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int n = sc.nextInt();
        System.out.println("Enter no of columns :");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[] sum = new int[m];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the elements of row no :" + i);
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] % 2 == 0){
                    sum[j]+= arr[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(sum));

    }
}
