public class RockPaperScisor {
    public static void main(String[] args) {
       String s = "PP";
        System.out.println(gameResult(s));
    }

    static String gameResult(String s) {
        // your code here
        char a = s.charAt(0);
        char b = s.charAt(1);
        if(a == b){
            return "DRAW";
        } else if (a == 'R' && b=='S' || a == 'S' && b == 'P' || a == 'P' && b == 'R') {
             return "A";
        }
        else {
            return "B";
        }
    }
}
