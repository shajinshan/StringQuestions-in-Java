import java.util.Vector;

public class FindNumberItself {

    public static void main(String[] args) {
        System.out.println(solve(1,2));
    }
    public static Vector<Integer> solve(int n, int d) {
        // code here
       Vector<Integer> integer = new Vector<>();

        for (int i = 1; i <= n ; i++) {
            String s = String.valueOf(i);
            if(s.contains(Integer.toString(d))){
                integer.add(i);
            }
        }
        if(integer.isEmpty()){
            Vector<Integer> vec = new Vector<>();
             vec.add(-1);
             return vec;
        }
        return  integer;
    }

}
