public class LastIdx {
    public static void main(String[] args) {
     //   System.out.println(LastIndex("okiyh",'z'));
        String x ="5";
        int f = Integer.parseInt(x);

    }
    static int LastIndex(String s, char p) {
        // code here
        int lastIdx = -1;

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == p){
                lastIdx = i;
            }
        }

        return lastIdx;


    }
}
