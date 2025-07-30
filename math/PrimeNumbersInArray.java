public class PrimeNumbersInArray {
        public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        for (int num : arr) {
            boolean isPrime = true;
            if (num > 1) {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(num);
                }
            }
        }

    }
}
