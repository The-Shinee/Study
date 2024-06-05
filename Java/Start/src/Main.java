import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[6];
        int value;
        System.out.print("로또 번호 : ");
        for(int i = 0 ; i < arr.length ; i++){
            do {
                value = random.nextInt(45 + 1);
            } while(isContain(arr, value));
            arr[i] = value;
            System.out.printf("[%d] ", arr[i]);
        }
    }

    static boolean isContain(int[] arr, int value){
        boolean result = false;
        for(int v : arr){
            if(v == value)
            {
                result = true;
                break;
            }
        }
        return result;
    }
}