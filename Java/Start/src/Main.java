import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int ADD = 1;
        final int SUB = 2;
        final int MUL = 3;
        final int DIV = 4;
        final int EXIT = 0;

        Scanner sc = new Scanner(System.in);

        int[] availableCommands = {ADD, SUB, MUL, DIV, EXIT};
        int command;
        double firstValue;
        double secondValue;

        do {
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");

            command = sc.nextInt();

            if (!validator(availableCommands, command)) {
                System.out.println("올바른 입력이 아닙니다.");
                continue;
            }

            if (command == EXIT) {
                break;
            }

            System.out.println("첫 번째 값을 입력하고 엔터를 누르세요.");
            firstValue = sc.nextDouble();

            System.out.println("두 번째 값을 입력하고 엔터를 누르세요.");
            secondValue = sc.nextDouble();

            printCalcResult(firstValue, secondValue, command);

        } while (true);

        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

    static double calc(double first, double second, int operator) {
        return switch (operator) {
            case 1 -> add(first, second);
            case 2 -> sub(first, second);
            case 3 -> mul(first, second);
            case 4 -> div(first, second);
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    static double add(double first, double second) {
        return first + second;
    }

    static double sub(double first, double second) {
        return first - second;
    }

    static double mul(double first, double second) {
        return first * second;
    }

    static double div(double first, double second) {
        return first / second;
    }

    static char printOperator(int operator) {
        return switch (operator) {
            case 1 -> '+';
            case 2 -> '-';
            case 3 -> '*';
            case 4 -> '/';
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    static void printCalcResult(double first, double second, int operator) {

        String firstFormatted = doubleFormatter(first);
        String secondFormatted = doubleFormatter(second);
        String calcResultFormatted = doubleFormatter(calc(first, second, operator));

        String message = secondFormatted.equals("0") ?
                "Error : 0으로 나눌 수 없습니다." :
                firstFormatted + " " + printOperator(operator) + " " + secondFormatted + " = " + calcResultFormatted;

        System.out.println(message);
    }

    static String doubleFormatter(double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(value);

        if (formatted.endsWith(".00") || formatted.endsWith(".0")) {
            formatted = formatted.substring(0, formatted.indexOf('.'));
        }

        return formatted;
    }

    static boolean validator(int[] commands, int command) {
        for (int value : commands) {
            if (value == command)
                return true;
        }

        return false;
    }
}