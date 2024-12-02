public class ReverseString {
    public static void main(String[] args) {
        String str="ama";

        int l=0;
        int r=str.length()-1;

        char[] arr=str.toCharArray();

        while (l<r){
           char temp =arr[l];
           arr[l]=arr[r];
           arr[r]=temp;
           l++;
           r--;
        }

        String s= new String(arr);

        if( s.equals(str)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("no");
        }
    }
}
