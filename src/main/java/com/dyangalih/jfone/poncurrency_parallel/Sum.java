package com.dyangalih.jfone.poncurrency_parallel;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Long> {
    private int low;
    private int high;
    private int[] array;

    Sum(int[] array, int low, int high) {
        this.array = array;
        this.low   = low;
        this.high  = high;
    }

    protected Long compute() {

        if(high - low <= 10) {
            long sum = 0;

            for(int i = low; i < high; ++i)
                sum += array[i];
            return sum;
        } else {
            int mid = low + (high - low) / 2;
            Sum left  = new Sum(array, low, mid);
            Sum right = new Sum(array, mid, high);
            left.fork();
            long rightResult = right.compute();
            long leftResult  = left.join();
            return leftResult + rightResult;
        }
    }
}
