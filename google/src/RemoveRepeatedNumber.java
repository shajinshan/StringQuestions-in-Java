public class RemoveRepeatedNumber {

    public static void main(String[] args) {
        long n= 23422;

        System.out.println(modify(n));
    }
    public static long modify(long N) {
        // code here
       String inp = Long.toString(N);
       StringBuilder res = new StringBuilder();

        for (int i = 0; i < inp.length(); i++) {
             if(res.length() == 0 || res.charAt(res.length()-1) != inp.charAt(i)){
                 res.append(inp.charAt(i));
             }
        }
        return Long.parseLong(res.toString());
    }

}
