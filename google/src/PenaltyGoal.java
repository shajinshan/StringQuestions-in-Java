import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PenaltyGoal {
    public static void main(String[] args) {
        System.out.println(penaltyScore("01000221"));

        List<String> l = new ArrayList<>();

    }
    public static int penaltyScore(String S) {
        // Your code goes here
        int goal = 0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '2'){
                if(i+1 >= S.length()){
                    return goal;
                }

                else if(S.charAt(i+1) == '1'){
                    goal++;
                }
            }
        }

        return goal;
    }
}
