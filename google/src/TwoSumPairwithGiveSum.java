import java.util.HashMap;
import java.util.Map;

public class TwoSumPairwithGiveSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(twoSum(arr,16));
    }

    static boolean twoSum(int[] arr, int target) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }
}
