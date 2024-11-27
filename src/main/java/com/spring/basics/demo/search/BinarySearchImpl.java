package com.spring.basics.demo.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Scope("prototype")
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quickSort")
    private SortingAlgorithm algorithm;
    public int binarySearch(int[] numbers, int numberToSearch) {
        // sorting an array
        // search the array
        // return the result
        algorithm.sort(numbers);
        System.out.println("BInary search");
        return Arrays.binarySearch(numbers, numberToSearch);
    }

}
