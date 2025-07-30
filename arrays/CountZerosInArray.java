
public class CountZerosInArray {

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 6, 0};
        int zeroCount = 0;
        for(int i : arr){
            if(i==0){
                zeroCount++;
            }
        }
        System.out.println(zeroCount);
    }
}
