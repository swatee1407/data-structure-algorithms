/**
 * Created by Swati Tewari on 9/10/2022
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr = new int[]{1,6,3,4,0};
        int n = arr.length;
        int i =0, j=n-1;
        while (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
        }
    }

}
