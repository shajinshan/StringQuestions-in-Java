import java.util.ArrayList;

public class SubstringwithAllVowels {
    public static void main(String[] args) {

        String str = "qwertyuioplkjhgfdsazxcvbnm";

        int n= str.length();
        ArrayList<Character>arrayList=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u'){
                arrayList.add(str.charAt(i));
            }
        }
        System.out.println(arrayList);
    }
}
