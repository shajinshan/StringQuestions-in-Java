public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,2,1,3};
        System.out.println(minimumJump(arr));
    }

    static int minimumJump(int[] arr) {
       int jump = 0;
       int step = arr[0];
       int maxReach = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxReach = Math.max(maxReach,i + arr[i]);
            step--;

            if(step == 0){
                jump++;
                step = maxReach - i;
            }
        }
        return jump;
    }
}
