import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Swati Tewari on 5/3/2022
 */
public class PrintAllSubarrays {

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(24);
        arr.add(33);arr.add(13);arr.add(11);arr.add(30);

        System.out.println(solve(arr, 13));
    }

    public static int solve(List<Integer> A, int B) {
        Integer[] arr = A.toArray(new Integer[0]);

        for (int i = 0; i < arr.length; i++){
            if(arr[i]==B) {
                return i+1;
            }

        }
        return -1;
    }


}
