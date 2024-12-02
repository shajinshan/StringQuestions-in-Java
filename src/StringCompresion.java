public class StringCompresion {
    public static void main(String[] args) {
        
        String str="aabbccdd";
        stringCompresion(str);
    }

    private static void stringCompresion(String str) {
        StringBuilder s=new StringBuilder();
        int count=1;
        int n=str.length();

        for (int i = 1; i < n; i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else {
                s.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        s.append(str.charAt(n-1)).append(count);
        System.out.print(s);
    }
}
