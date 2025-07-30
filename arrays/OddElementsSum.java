public class OddElementsSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int oddSum = 0;

        for (int i : arr) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        System.out.println(oddSum);
    }

}
