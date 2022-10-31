/**
 * Created by Swati Tewari on 10/7/2022
 */
public class SumOfDigits {
    public static void main(String[] args) {
        int result = solve(46);
        System.out.println(result);
    }

    public static int solve(int A){
        int sum=0;
        //get last digit by doing %10
        while (A != 0)
        {
            sum = sum + A % 10;
            A = A/10;
        }
        return sum;
    }
}
