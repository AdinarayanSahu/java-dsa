class ReverseCharacters {
    public static void main(String[] args) {
        char[] arr = { 'A', 'B', 'C', 'D', 'E' };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}