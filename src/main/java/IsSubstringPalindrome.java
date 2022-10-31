/**
 * Created by Swati Tewari on 10/6/2022
 */
public class IsSubstringPalindrome {

    public static void main(String[] args) {
        System.out.println(checkSubstring("dad"));
    }

    private static boolean checkSubstring(String str){
        //get the string from start -s to end -e index
        //check if its palindrome
        int left=0; int right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

}
