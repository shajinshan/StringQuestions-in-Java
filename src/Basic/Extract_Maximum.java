package Basic;

import java.util.ArrayList;

public class Extract_Maximum {
    public static void main(String[] args) {
        System.out.println(extractMaximum("sdfsdfs"));
    }

    static int extractMaximum(String s)
    {
        // code here

        String[] arr= s.split("[abcdefghijklmnopqrstuvwxyz]");
        ArrayList<Integer> temp =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != ""){
                temp.add(Integer.parseInt(arr[i]));}
        }
        if(temp.size() < 1){
            return -1;
        }
        int min = temp.get(0);
        for (int i = 1; i <temp.size() ; i++) {
            if(min < temp.get(i)){
                min = temp.get(i);
            }
        }
        return min;
    }
}
