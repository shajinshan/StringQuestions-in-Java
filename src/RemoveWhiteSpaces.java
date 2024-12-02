import java.util.ArrayList;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str ="a b cdsjnlds ogjnerlgeer erggerge gegegeggg e gg";

        ArrayList<Character>arrayList=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                arrayList.add(str.charAt(i));
            }
        }
        String rs ="";
        for (char r:arrayList) {
            rs+=r;
        }
        System.out.println(rs);
    }
}
