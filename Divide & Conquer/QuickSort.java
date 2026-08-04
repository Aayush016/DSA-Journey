public class QuickSort {

    public static void quickSort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }
        // Pivot = last element
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // To make place

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}


/*
Works on the principle of Pivot & Partition
Step-1: Pivot (Last Element) {5}
Step-2: Partition
        Divide into parts around the pivot
        {3,2} < {5} < {6,9,8}
Step-3: quickSort(left & right)

*/
