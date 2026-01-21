public class CountWords {
    // str: input string

    public static void main(String[] args) {
        System.out.println(countWords("World is hello"));
    }
    public static int countWords(String str) {
        String[] arr =str.split(" ");

        return arr.length;
    }
}
