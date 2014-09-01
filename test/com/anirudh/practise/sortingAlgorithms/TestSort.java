package com.anirudh.practise.sortingAlgorithms;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by anirudh on 01/09/14.
 */
public class TestSort {

    private Sort sort = new Sort();
    private int[] arr = {4,3,1,2};

    @Test
    public void testBubbleSort() {
        System.out.println("Bubble    sort : "+ Arrays.toString(sort.bubbleSort(arr)));
    }

    @Test
    public void testInsertionSort(){
        System.out.println("Insertion Sort : "+Arrays.toString(sort.insertionSort(arr)));
    }

    @Test
    public void testMergeSort(){
        System.out.println("Merge Sort : "+Arrays.toString(sort.mergeSort(arr)));
    }

    @Test
    public void testFindInversions(){
        System.out.println(" Number of Conversions : "+sort.findInversions(arr));
    }

    @Test
    public void testQuickSort(){
        System.out.println("Quick Sort : "+Arrays.toString(sort.quick_sort(arr)));

    }
}
