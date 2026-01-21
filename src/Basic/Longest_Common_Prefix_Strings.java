package Basic;

public class Longest_Common_Prefix_Strings {
    public static void main(String[] args) {
       String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String arr[]) {
        if(arr.length<1){
            return "";
        }
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
