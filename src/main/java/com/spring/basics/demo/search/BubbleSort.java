package com.spring.basics.demo.search;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Qualifier("bubbleSort")
public class BubbleSort implements SortingAlgorithm{
    @Override
    public void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Performing bubble sort");
    }
}
