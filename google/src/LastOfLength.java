public class LastOfLength {
    public static void main(String[] args) {
          String s ="hi hello";
        System.out.println(findLength(s));

    }
    static int findLength(String s) {
        // code here
         String[] split = s.split(" ");
         return split[split.length - 1].length();
    }
}
