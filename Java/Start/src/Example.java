import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("100 이상 숫자 입력");
            int a = sc.nextInt();

            if (a < 100) {
                throw new CustomException("입력된 숫자가 100 미만입니다.");
            }

            System.out.println("Input number: " + a);

        } catch (CustomException e) {
            System.err.println("CustomException: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
