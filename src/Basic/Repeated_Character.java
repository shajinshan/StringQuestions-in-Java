package Basic;

public class Repeated_Character {
    public static void main(String[] args) {
        System.out.println(firstRep("geeksforgeeks"));
    }

   static char firstRep(String S)
    {
        // your code here

        for (int i = 0; i < S.length()-1; i++) {
            for (int j = i+1; j < S.length(); j++) {
                if(S.charAt(i) == S.charAt(j)){
                  return S.charAt(i);
                }
            }
        }

        return '#';
    }
}
