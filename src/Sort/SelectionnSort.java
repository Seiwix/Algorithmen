package Sort;
//  time complexity O(n^2)
public class SelectionnSort {
    public static void main(String[] args) {
        int  arr[] = { 3,1,2,32,5,99,7};
        arr = selectionSort(arr);
        for(int num : arr)
        {
            System.out.println(num);
        }
    }
    public static int[] selectionSort(int arr[])
    {
        for(int i = 0; i < arr.length; i++ )
        {
            int small = i;
            for(int j = i+1; j< arr.length; j++)
            {
                if(arr[small]> arr[j])small = j;
            }
            int tamp = arr[small];
            arr[small] = arr[i];
            arr[i] = tamp;
        }
        return  arr;
    }

}
