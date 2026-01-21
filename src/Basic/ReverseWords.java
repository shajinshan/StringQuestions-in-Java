package Basic;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords(" i like this program very much "));
    }
    public static String reverseWords(String s) {
        // Code here
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<arr.length-1;i++){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }
}
