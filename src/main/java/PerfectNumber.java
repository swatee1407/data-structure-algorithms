import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Swati Tewari on 4/26/2022
 */
public class PerfectNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i < numbers.length; i++) {
            int n = sc.nextInt();
            int sum = 0;

            //get all factors of n
            //factors of n will exist in range of 1-(n-1)
            for(int j=1;j<n;j++){
                if(n%j==0){
                    sum = sum + j;
                }
            }

            if(sum==n){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
