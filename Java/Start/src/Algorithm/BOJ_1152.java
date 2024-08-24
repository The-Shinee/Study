package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1152 {
    public void Func() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                continue;
            }

            if (str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
