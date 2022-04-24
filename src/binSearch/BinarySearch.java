package binSearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 7, 23, 24, 58, 99, 100};
        System.out.println(binSearch(arr,7));
    }
    public static  int binSearch(int arr[] ,int element)
    {   int end = arr.length;
        int start = 0;
        while (start < end  )
        {
            int mid = start + (end - start) / 2;

            if(arr[mid] == element) return mid;
            else if(arr[mid] > element) end = mid;
            else start  = mid +1;
        }
        return -1;
    }
}
