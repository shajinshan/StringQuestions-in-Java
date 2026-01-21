public class MajorityElement {
    public static void main(String[] args) {
int[] arr = {3, 1, 3, 3, 2};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int arr[]) {
        // your code here
        int candidate = -1, count = 0;

        // Step 1: Find candidate
        for(int num : arr)
        {
            if(count == 0)
            {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Verify candidate
        count = 0;
        for(int num : arr)
        {
            if(num == candidate)
            {
                count++;
            }
        }

        return (count > arr.length / 2) ? candidate : -1;
    }

}
