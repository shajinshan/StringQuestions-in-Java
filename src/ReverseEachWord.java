public class ReverseEachWord {
    public static void main(String[] args) {

        String str ="ahs nij";

        String[] words = str.split(" ");

        StringBuilder sb =new StringBuilder();

        for (String word : words){
            StringBuilder rev = new StringBuilder(word).reverse();

            sb.append(rev).append(" ");
        }
        System.out.println(sb.toString());
    }
}
