package Algorithm;

import java.util.Scanner;

public class BOJ_5597 {
    public static void Func() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[30];
        for (int i = 0; i < 30; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            arr[a - 1] = 0;
        }
        for (int n : arr) {
            if (n != 0) {
                System.out.println(n);
            }
        }
    }
}
