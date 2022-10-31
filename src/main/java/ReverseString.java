import java.util.Scanner;

/**
 * Created by Swati Tewari on 10/7/2022
 */
public class ReverseString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        System.out.println(reverseString(input));


    }

    private static String reverseString(String str){
        if (str.isEmpty()) {
            return str;
        }
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);

    }

}
