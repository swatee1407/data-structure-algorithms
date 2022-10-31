import java.util.Scanner;

/**
 * Created by Swati Tewari on 4/25/2022
 */
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(ifArmstrong(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean ifArmstrong(int n){
        int temp=n, sum = 0;
        if(n>500){
            return false;
        }

        while(temp>0){
            //get the digits of the number
            int r = n % 10;
            sum = sum + (r ^3);
            temp=temp/10;
        }
        if(sum == n){
            return true;
        }
        return false;

    }

}