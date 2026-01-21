package Basic;

public class RepeatingChar {
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("geeksforgeeks"));
    }

    static int repeatedCharacter(String S)
    {
        // add your code here
        boolean arr[] = new boolean[256];

        int index = -1;

        for(int i= S.length()-1;i>=0;i--){

            char c = S.charAt(i);

            if(arr[c] == false) {
                arr[c] = true;
            } else {
                index = i;
            }

        }

        return index;
    }
}
