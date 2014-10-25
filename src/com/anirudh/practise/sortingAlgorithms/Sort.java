package com.anirudh.practise.sortingAlgorithms;

/**
 * Created by anirudh on 09/08/14.
 */
public class Sort {

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (key < arr[j]) {
                    int temp = arr[j];
                    arr[j] = key;
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] mergeSort(int[] arr) {
        int[] helper = new int[arr.length];
        merge_sort(0, arr.length - 1, arr, helper);
        return arr;
    }

    private void merge_sort(int low, int high, int[] arr, int[] helper) {

        if (low < high) {
            int mid = (high + low) / 2;
            merge_sort(low, mid, arr, helper); //left
            merge_sort(mid + 1, high, arr, helper);  //right
            merge(low, mid, high, arr, helper);
        }
    }

    private void merge(int low, int mid, int high, int[] arr, int[] helper) {

        int left_index = low;
        int right_index = mid + 1;
        int current = low;

        //Copying the part of array in analysis into an helper temp array
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }

        while (left_index <= mid && right_index <= high) {
            if (helper[left_index] <= helper[right_index]) {
                arr[current] = helper[left_index];
                left_index++;
            } else {
                arr[current] = helper[right_index];
                right_index++;
            }
            current++;
        }

        //copy remaining
        int remaining = mid - left_index;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[left_index + i];
        }
    }


    public int findInversions(int[] arr) {

        int[] helper = new int[arr.length];
        return merge_sort_inv(0, arr.length - 1, arr, helper);
    }

    public int merge_sort_inv(int low, int high, int[] arr, int[] helper) {

        int inv_count = 0;
        if (high > low) {
            int mid = (low + high) / 2;
            inv_count += merge_sort_inv(low, mid, arr, helper);
            inv_count += merge_sort_inv(mid + 1, high, arr, helper);
            inv_count += merge_count_inv(low, mid, high, arr, helper);
        }
        return inv_count;
    }

    private int merge_count_inv(int low, int mid, int high, int[] arr, int[] helper) {

        int count = 0;
        int left_index = low;
        int right_index = mid + 1;
        int current = low;

        //Copying the part of array in analysis into an helper temp array
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }

        while (left_index <= mid && right_index <= high) {
            if (helper[left_index] <= helper[right_index]) {
                arr[current] = helper[left_index];
                left_index++;
            } else {
                //found an inversion
                int temp = mid + 1 - left_index;
                count = count + temp;
                arr[current] = helper[right_index];
                right_index++;
            }
            current++;
        }

        //copy remaining
        int remaining = mid - left_index;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[left_index + i];
        }
        return count;
    }

    public int[] quick_sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int low, int high) {

        int index = choosePivot(arr, low, high);
        if (low < index - 1) {
            quickSort(arr, low, index - 1);
        }
        if (index < high) {
            quickSort(arr, index, high);
        }
    }

    private int choosePivot(int[] arr, int low, int high) {

        int mid = (low + high) / 2;
        int pivotElement = arr[mid];

        while (low <= high) {
            while (arr[low] < pivotElement) low++;
            while (arr[high] > pivotElement) high--;

            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

}
