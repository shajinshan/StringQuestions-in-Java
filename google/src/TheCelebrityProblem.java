import java.util.ArrayList;
import java.util.List;

public class TheCelebrityProblem {
    public static void main(String[] args) {
         int[][] mat = {{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        System.out.println(celebrity(mat));
    }

    public static int celebrity(int[][] mat) {
int n = mat.length;
        int[] iKnow=new int[n];
        int[] knowMe=new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(mat[i][j] == 1){
                   iKnow[i]++;
                   knowMe[j]++;
               }
            }
        }

        for (int i = 0; i < n; i++) {
            if (iKnow[i] == 1 && knowMe[i] == n){
                return i;
            }
        }
        return -1;
    }
}
