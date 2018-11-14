public class Runner {
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,5,4,66,5};
        printArr(arr);
        BubbleSort(arr);
        printArr(arr);
    }
    public static void BubbleSort(int[] arr)
    {
        int swaps = 0;
        boolean swapped = true;
        while(swapped)
        {
            for(int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swaps++;
                }
            }
            if(swaps > 0)
            {
                swaps = 0;
            }
            else
            {
                if(swaps == 0)
                {
                    swapped = false;
                }
            }
        }
    }
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            System.out.print(" | ");
        }
        System.out.println();
    }
}
