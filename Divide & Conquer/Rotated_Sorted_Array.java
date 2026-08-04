public class Rotated_Sorted_Array {

    public static int search(int arr[], int tar, int si, int ei){
         // Base Case
        if(si > ei){
            return -1;
        }

         // Work
        int mid = si + (ei-si)/2;

        // Case 1
        if(arr[mid] == tar){
            return mid;
        }

        // Mid on L1
        if(arr[si] <= arr[mid]){
            // case-a: Left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            } else{
                // case-b: Right
                return search(arr, tar, mid+1, ei);
            }

        }

        // Mid on L2
        else{
            // case-c: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            } else{
                // case-d: left
                return search(arr, tar, si, mid-1);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        // printArr(arr);
        int target = 6;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}

/*

input : sorted, rotated array with distinct numbers (in ascending order)
It is rotated at a pivot point. Find the index of given element.

{4,5,6,7,0,1,2}

target : 0      output : 4

We will be using MODIFIED BINARY SEARCH

*/
