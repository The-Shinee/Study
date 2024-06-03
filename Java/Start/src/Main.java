import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 2
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();

        double num1 = 1, num2 = 2;

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Error : Input value is : " + operator);
        }

        // 3
        String color = scanner.nextLine();
        String resultColorText = "";
        switch (color) {
            case "red":
                resultColorText = "Apple";
                break;
            case "green":
                resultColorText = "Grass";
                break;
            case "blue":
                resultColorText = "Sky";
                break;
            default:
                System.out.println("Error : Input value is : " + color);
        }

        System.out.println(resultColorText);

        int score = scanner.nextInt();
        char grade = ' ';
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println(grade);

        String language = scanner.nextLine();
        String description = "";
        switch (language) {
            case "Java":
                description = "컴파일, 인터프리터 하이브리드 언어로 국내에서 웹 백엔드 개발에 주로 사용";
                break;
            case "Python":
                description = "인터프리터 언어로 AI 머신러닝에 주로 사용";
                break;
            case "C++":
                description = "컴파일 언어로 메모리를 직접 조작할 수 있으며, 임베디드 시스템에 주로 사용";
                break;
            case "JavaScript":
                description = "인터프리터 언어로 웹 개발에 주로 사용";
            default:
                System.out.println("Error : Input value is : " + description);
        }

        System.out.println(description);

    }
}