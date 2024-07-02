package Algorithm;

import java.util.Scanner;

public class BOJ_10811 {
    public static void Func(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = i + 1;
        }

        for(int i = 0 ; i < m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            while(b > a){
                int swapValue = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = swapValue;
                a++;
                b--;
            }
        }

        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
