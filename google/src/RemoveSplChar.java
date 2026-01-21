public class RemoveSplChar {
    public static void main(String[] args) {
        System.out.println(removeSpecialCharacter("{{{}}> *& ^%*)"));
    }

    static String removeSpecialCharacter(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 97 && c<=122){
                str.append(c);
            }
            else if(c >= 65 && c<=90){
                str.append(c);
            }
        }

        return str.isEmpty() ? "-1" : str.toString();
    }
}
