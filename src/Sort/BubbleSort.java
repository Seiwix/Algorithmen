package Sort;
 // time complexity O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int  arr[] = { 3,1,2,32,5,99,7};
        arr = bubbleSort(arr);
        for(int num : arr)
        {
            System.out.println(num);
        }
    }
    public static  int[] bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length;  i++)
        {
            for(int j = i+ 1; j< arr.length; j++ )
            {
                if(arr[i] > arr[j]) {
                    int tamp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tamp;
                }
            }
        }
        return arr;
    }
}
