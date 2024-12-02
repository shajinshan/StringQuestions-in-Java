public class FindNonRepeatedChars {
    public static void main(String[] args) {

        String str = "program";

        char[] hash =new char[256];

        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
           if(hash[str.charAt(i)] == 1){

               System.out.println(str.charAt(i));
           }
        }
    }
}
