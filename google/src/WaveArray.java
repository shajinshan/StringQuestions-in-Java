public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 9, 10};
        convertToWave(arr);

        for (int i : arr){
            System.out.println(i);
        }
    }
    public static void convertToWave(int[] arr) {

        for (int i = 0; i < arr.length; i +=2 ) {
            if(i >= arr.length -1){
                return;
            }
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
