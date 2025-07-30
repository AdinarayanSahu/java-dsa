
import java.util.Scanner;

public class InsertEvenValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int[] evenArr = new int[5];
        int evenIndex = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex] = arr[i];
                evenIndex++;
            }
        }

        System.out.println("Index Values: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(evenArr[i]);
        }
    }
}
