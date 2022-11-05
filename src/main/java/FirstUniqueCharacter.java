import java.util.HashMap;

/**
 * Created by Swati Tewari on 11/3/2022
 */
public class FirstUniqueCharacter {
    // This question was asked in Goldman Sachs interview -Leetcode

    public static void main(String[] args){
        System.out.println(checkIfUnique("LOVEATLAST"));
    }

    public static int checkIfUnique(String s){
        HashMap<Character,Integer> count = new HashMap<>();
        int n =s.length();
        //build hashmap with character and how often it appears.
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            System.out.println("Char "+c+"count.getOrDefault(c, 0) :::"+count.getOrDefault(c, 0) + 1);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

}
