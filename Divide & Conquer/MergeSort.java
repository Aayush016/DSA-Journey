public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }

        // Kaam
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); // Left part
        mergeSort(arr, mid+1, ei); // Right Part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++]; // Takes the curr value uses it and then changes
        }
        while(j <= ei){
            temp[k++] = arr[j++]; // Takes the curr value uses it and then changes
        }

        // copy temp to original array
        for( k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5,12,-2,-4,-9,-7};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

/*

Approach
Step-1: Divide
        Find mid of the array.
        {6,3,9,5,2,8}
        {6,3,9} || {5,2,8}
        {6,3}, {9} || {5,2}, {8}
        {6}, {3}, {9} || {5}, {2}, {8}

Step-2: mergeSort(left) & mergeSort(right)


Step-3: Merge
        Create a temp array of size (left + right elements)
        Two iterator for both left and right
        compare both elements and place the smallest one in the temp arr. 
        (We will use another iterator for the placement)


*/