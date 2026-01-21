package Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Sum_numbers_in_string {
    public static void main(String[] args) {
        String s = "geeks4geeks22jhh2";
        System.out.println(findSum(s));
    }
    public static int findSum(String s) {
        // your code here

        String[] arr= s.split("[abcdefghijklmnopqrstuvwxyz]");

        ArrayList<Integer> temp =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != ""){
           temp.add(Integer.parseInt(arr[i]));}
        }

        int res = 0;
        for (int i = 0; i < temp.size(); i++) {
            res +=temp.get(i);
        }
return res;
    }
}
