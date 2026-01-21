import java.util.ArrayList;

public class ExtractInteger {

    public static void main(String[] args) {
        System.out.println(extractIntegerWords("1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56"));
    }
    static ArrayList<String> extractIntegerWords(String s) {
        // code here
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                StringBuilder sb = new StringBuilder();

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    i++;
                }

                list.add(sb.toString());
                i--; // prevent skipping
            }
        }
        return list;

    }
}

