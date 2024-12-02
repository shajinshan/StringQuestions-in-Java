public class MatchesThePattern {
    public static void main(String[] args) {

        String str = "hello world";
        String pattern="hellso";

        boolean res=matchesPattern(str,pattern);
        System.out.println(res);

    }
    public static  boolean matchesPattern(String str,String pattern){
        int s=str.length();
        int p=pattern.length();
        if(p > s){
            return false;
        }

        for (int i = 0; i < s- p; i++) {

            String window = str.substring(i,i+p);
            if(pattern.equals(window)){
                return true;
            }
        }
return false;
    }
}
