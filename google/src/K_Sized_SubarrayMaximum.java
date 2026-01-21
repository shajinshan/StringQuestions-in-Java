import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class K_Sized_SubarrayMaximum {
    public static void main(String[] args) {
int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        System.out.println(maxOfSubarrays(arr,4));
    }
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i < n; i++) {
            while(dq.size() != 0 && arr[dq.getLast()] < arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            if(i - dq.getFirst() == k) dq.removeFirst();
            if(i >= k -1) {
                ans.add(arr[dq.getFirst()]);
            }
        }
        return ans;
    }
}
