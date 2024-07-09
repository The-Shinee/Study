package Algorithm;

import java.util.Scanner;

public class BOJ_9086 {
    public void Func(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextLine();
        }

        for(String str : arr){
            if(str.length() == 1){
                System.out.print(str);
                System.out.println(str);
            }
            else{
                System.out.print(str.charAt(0));
                System.out.println(str.charAt(str.length() - 1));
            }
        }
    }
}
