import java.util.Arrays;

public class Kth_Smallest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 20, 15};
        kthSmallest(arr,4);
    }
    public static int kthSmallest(int[] arr, int k) {
        if(arr.length == 1){
            return arr[0] ;
        }
        //sort the array with pivot technique
        int pivot = arr.length - 1;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < pivot ; j++) {
                if(arr[j] > arr[pivot]) {
                    int temp = arr[j];
                    arr[j] = arr[pivot];
                    arr[pivot] = temp;
                }
            }

            if(pivot > 0 ) pivot--;
        }

        for (int n : arr){
            System.out.println(n);
        }

        return arr[k - 1];
    }
}
