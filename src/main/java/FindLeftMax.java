import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Swati Tewari on 9/25/2022
 */
public class FindLeftMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int max = numbers[0];
        int n = numbers.length;

        //take input of an array one by one.
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }

        //LM[0]=A[0];
        //LM[1] =max(A[0],A[1]);
        //LM[2]=max(A[0],A[1],A[2]);
        //LM[i]=LM(max{i-1],A[i]);

        for (int i = 1; i<n; i++) {
           if(max<numbers[i])
               max = numbers[i];
        }
        System.out.println("max element is :" + max);


    }

}
