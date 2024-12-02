public class FindAnagram {
    public static void main(String[] args) {

        String a="shd";
        String b="has";

        int[] hash=new int[256];

        for (int i = 0; i <a.length() ; i++) {
            hash[a.charAt(i)-'a']++;
        }

        for (int i = 0; i <b.length() ; i++) {
            hash[b.charAt(i)-'a']--;
        }
        for (int i = 0; i <hash.length ; i++) {
            if(hash[i] != 0){
                System.out.println("not a anagram");
                break;
            }
        }
        System.out.println("anagram");

    }
}
