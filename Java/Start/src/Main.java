import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // 1.
        // System.out.println(getMiddleThree(sc.nextLine()));

        // 2.
        //System.out.println(barkingDogProblem(true, 6));
        //System.out.println(barkingDogProblem(true, 7));
        //System.out.println(barkingDogProblem(false, 5));

        // 3.
        // 주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요.
        //String str = "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on. ";
        //printCategory(str);

        // 4.
        // 다음 문장을 for 문을 이용해 순회하면서 안에 있는 문자를 모두 순서대로 한번씩 콘솔로 출력해보세요.
        // 그리고 거꾸로 가장 마지막 문자부터 출력하도록 만들어 보세요.
        //String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
        //printSpelling(someTxt, true);

        // 5.
        /*
         *    배열안에서 특정한 데이터를 찾는 함수를 만들어보세요. 찾을 수 있으면 해당원소의 index 값을 반환하고, 찾지 못하면 -1을 반환합니다. */
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 6));
    }

    static String getMiddleThree(String str) {
        if (str.length() < 3)
            return str;

        int middle = str.length() / 2;

        return str.substring(middle - 1, middle + 2);
    }

    static String barkingDogProblem(boolean isBark, int hour) {
        if (hour < 7 || hour >= 20) {
            if (isBark) {
                return "짖으면 안돼!!";
            } else {
                return "든든하군!";
            }
        }

        return "든든하군!";
    }

    static void printCategory(String str) {
        final String FILTER_VALUE = "category: ";
        int index = 0;
        while (true) {
            int startIndex = str.indexOf(FILTER_VALUE, index) + FILTER_VALUE.length();
            if (startIndex - FILTER_VALUE.length() == -1)
                break;

            int endIndex = str.indexOf(',', startIndex);
            String value = str.substring(startIndex, endIndex);
            System.out.println(value);
            index = endIndex + 1;
        }
    }

    static void printSpelling(String str) {
        printSpelling(str, false);
    }

    static void printSpelling(String str, boolean isReverse) {
        if (isReverse) {
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.println(str.charAt(i));
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }
    }

    static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }

        return -1;
    }
}