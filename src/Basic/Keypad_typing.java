package Basic;

public class Keypad_typing {
    public static void main(String[] args) {
        String s ="geeksforgeeks";
        System.out.println(printNumber(s,s.length()));
    }

    public static String printNumber(String m, int n)
    {
        //Your code here
        String s = m.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'b' ||c == 'c' ){
                sb.append('2');
            } else if (c == 'd' || c == 'e' ||c == 'f') {
                sb.append('3');
            }

            else if (c == 'g' || c == 'h' ||c == 'i') {
                sb.append('4');
            }

            else if (c == 'j' || c == 'k' ||c == 'l') {
                sb.append('5');
            }

            else if (c == 'm' || c == 'n' ||c == 'o') {
                sb.append('6');
            }

            else if (c == 'p' || c == 'q' ||c == 'r'||c == 's') {
                sb.append('7');
            }

            else if (c == 't' || c == 'u' ||c == 'v') {
                sb.append('8');
            }
            else if (c == 'x' || c == 'y' ||c == 'z') {
                sb.append('9');
            }
        }
return sb.toString();
    }
}
