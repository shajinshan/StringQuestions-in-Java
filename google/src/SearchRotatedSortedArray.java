public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(search(arr,2));
    }
    static int search(int[] arr, int key) {
        // Complete this function
        int l = 0;
        int r = arr.length-1;
        while ( l <= r){
        int mid =  (l + r)/2;

        if(arr[mid] == key){
            return mid;
        }

        if(arr[mid] >= arr[l]){
            if(arr[l] <= key && arr[mid] >= key){
                r = mid-1;

            }else {
            l = mid +1;
            }
        }
        else {
            if(arr[mid] <= key && key <= arr[r]){

            l = mid+1;
        }
            else {
                r = mid-1;
            }
        }
        }
        return -1;
    }
}
