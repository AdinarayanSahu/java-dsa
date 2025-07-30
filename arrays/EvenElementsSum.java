public class EvenElementsSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int evenSum = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println(evenSum);
    }

}
