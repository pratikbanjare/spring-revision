package com.spring.basics.demo.search;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Qualifier("quickSort")
public class QuickSort implements SortingAlgorithm{
    @Override
    public void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("QUick sorting array");
    }
}
