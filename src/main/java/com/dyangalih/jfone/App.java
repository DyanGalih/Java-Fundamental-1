package com.dyangalih.jfone;

import com.dyangalih.jfone.collection.CollectionTutorial;
import com.dyangalih.jfone.poncurrency_parallel.ThreadTutorial;
import com.dyangalih.jfone.poncurrency_parallel.join.Join;

public class App
{
    public static void main( String[] args ){
        /*
            Collection tutorial
         */
        CollectionTutorial collectionTutorial = new CollectionTutorial();

        collectionTutorial.start();

        /*
            Thread Tutorial
         */
//        ThreadTutorial threadTutorial = new ThreadTutorial();
//        threadTutorial.start();
//
//        /*
//            Multithread
//         */
//        threadTutorial.multiThread();
//
//        Join join = new Join();
//        join.start();

    }

}
