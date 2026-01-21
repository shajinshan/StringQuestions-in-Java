public class OddtoEven {

    public static void main(String[] args) {
        System.out.println(makeEven("1539"));
    }
    public static String makeEven(String sb) {
        StringBuilder s = new StringBuilder(sb);

        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) - '0')%2==0){
                char c = s.charAt(s.length()-1);

                s.setCharAt(s.length()-1,s.charAt(i));
                s.setCharAt(i,c);
                return s.toString();
            }
        }
        return s.toString();
    }
}
