package Basic;

public class Stringwithnumbersatitsend {
    public static void main(String[] args) {
   System.out.println(isSame("xyxapesj00047519742156243264036"));


    }

    static int isSame(String s) {
        // code here
        int length = 0;
        StringBuilder re = new StringBuilder();
        for(int i= 0;i<s.length();i++){
            char  c= s.charAt(i);
            if((c < 97 || c > 122) && (c < 65 || c > 90)){
                re.append(s.charAt(i - 1));

              break;
            }

        }
       String[] arr= s.split(re.toString());

        length = arr[0].length()+1;
        int num =Integer.parseInt(arr[1]);



       return length == num ? 1:0;
    }
}
