/**
 * Created by Swati Tewari on 10/6/2022
 */
public class FibonacciUsingRecursion {

    public static void main(String[] args) {
        //System.out.println(getFib(9));
        //printN(9);
        decreaseN(4);
  }

    private static int getFib(int n){
        if(n<=1)
            return n;
        int f = getFib(n-1)+getFib(n-2);
        return f;
    }

    private static void printN(int n){
        if(n>=1) {
            printN(n-1);
            System.out.println(n);//print in increasing order.
        }
    }

    private static void decreaseN(int n){
        if(n<=0)
            return;
        System.out.println(n);
        decreaseN(n-1);
    }
}
