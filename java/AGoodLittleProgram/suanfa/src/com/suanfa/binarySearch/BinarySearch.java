package com.suanfa.binarySearch;

/**
 * @author kouguangyuan
 * @date 2018/7/11 12:44
 */
public class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }

    public static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] i = new int[]{1, 2, 3, 4, 5};
        int a = binarySearch(i,0,4,5);
        System.out.println(i[a]);
        System.out.println(i[binarySearch(i,4)]);
    }
}
