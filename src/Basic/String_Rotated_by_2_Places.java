package Basic;

public class String_Rotated_by_2_Places {
    public static void main(String[] args) {
        System.out.println(isRotated("daxjheq","eqdaxjh"));
    }
    public static boolean isRotated(String s1, String s2) {
        // Your code here
        String str1  = s1.concat(s1);
        String str2  = s2.concat(s2);
        int a = str1.indexOf(s2);
        int b = str2.indexOf(s1);

        if(a==2 || b==2){
            return true;
        }
        return false;

    }

}
