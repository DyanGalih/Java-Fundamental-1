package com.dyangalih.jfone.poncurrency_parallel;

import com.dyangalih.jfone.poncurrency_parallel.multithreading.Multithreading;
import com.dyangalih.jfone.tools.AutoGenerate;
import com.dyangalih.jfone.tools.Print;

import java.util.concurrent.ForkJoinPool;

public class ThreadTutorial {
    public void start(){
        int nThreads = Runtime.getRuntime().availableProcessors();
        Print.getInstance().printOut();
        System.out.println("number of the available processor");
        System.out.println(nThreads);

        int[] numbers = new int[AutoGenerate.getInstance().getRandomSingleNumber(1000)];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool(nThreads);
        Long result = forkJoinPool.invoke(new Sum(numbers,0,numbers.length));
        Print.getInstance().printOut();
        System.out.println(result);
    }

    public void multiThread(){
        Print.getInstance().printOut();
        Multithreading multithreading = new Multithreading();
        multithreading.start();
    }
}
