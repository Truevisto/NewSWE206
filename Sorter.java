public class Sorter {

    public static void selectionSort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        } 

}

    public static void insertionSort (int[] list){
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int key;
            for ( key = i-1; key >= 0 && currentElement < list[key]; key--)
                list[key+1] = list[key];
            list[key+1] = currentElement;
        }
    }

    public static void sort(int[] arr) {
        selectionSort(arr);
    }
    // changed the neme by myself
    public static void inSort(int[] array){
        insertionSort(array);

    }
}

