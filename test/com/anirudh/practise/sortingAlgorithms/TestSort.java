package com.anirudh.practise.sortingAlgorithms;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

/**
 * Created by anirudh on 01/09/14.
 */
public class TestSort {

    private Sort sort = new Sort();
    private int[] arr = {3, 1, 5, 2, 4, 9, 6, 7};

    @Test
    public void testBubbleSort() {
        System.out.println("Bubble    sort : " + Arrays.toString(sort.bubbleSort(arr)));
    }

    @Test
    public void testInsertionSort() {
        System.out.println("Insertion Sort : " + Arrays.toString(sort.insertionSort(arr)));
    }

    @Test
    public void testMergeSort() {
        System.out.println("Merge Sort : " + Arrays.toString(sort.mergeSort(arr)));
    }

    @Test
    public void testFindInversionsFromFile() throws IOException {
        FileInputStream fis = new FileInputStream(new File("/Users/anirudh/IntegerArray.txt"));
        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
        String line;
        int count = 0;
        int my_arr[] = new int[100000];
        while ((line = bf.readLine()) != null) {
            my_arr[count++] = Integer.valueOf(line.trim());
        }

        System.out.println(count);
        System.out.print(my_arr.length);
        System.out.println(" Number of Inversions : " + sort.findInversions(my_arr));
    }

    @Test
    public void testFindInversions() throws IOException {

        System.out.println(" Number of Inversions : " + sort.findInversions(arr));
    }

    @Test
    public void testQuickSort() {
        System.out.println("Quick Sort : " + Arrays.toString(sort.quick_sort(arr)));

    }
}
