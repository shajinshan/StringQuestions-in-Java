package Basic;

public class Merge_two_strings {
    public static void main(String[] args) {
        System.out.println(merge("sain","hjn"));
    }
   static String merge(String S1, String S2)
    {
        // code here
        int i = 0;
        int j = 0;

       StringBuilder sb = new StringBuilder();

       while (i < S1.length() && j<S2.length()){

           sb.append(S1.charAt(i));
           i++;
           sb.append(S2.charAt(j));
           j++;
       }

       while (i<S1.length()){
           sb.append(S1.charAt(i));
           i++;
       }

        while (j < S2.length()){
            sb.append(S2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}
