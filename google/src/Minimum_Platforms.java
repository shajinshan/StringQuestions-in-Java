import java.util.Arrays;

public class Minimum_Platforms {
    static int findPlatform(int[] arr, int[] dep) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platform = 0;
        int max =0;
        int i =0,j=0;

        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {  
                platform++;
                max = Math.max(max, platform);
                i++;
            } else {
                platform--;
                j++;
            }
        }
        return max;
    }
}
