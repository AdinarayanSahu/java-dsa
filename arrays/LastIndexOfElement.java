
public class LastIndexOfElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 3, 9, 4, 9, 6, 7, 8};
        int n = 9;
        int lastIndex = -1;

        for(int i = 0; i < arr.length; i++){
            if(n == arr[i]){
                lastIndex = i;
            }
        }

        System.out.println(lastIndex);
    }
}
