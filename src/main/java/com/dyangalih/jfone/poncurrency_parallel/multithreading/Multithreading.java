package com.dyangalih.jfone.poncurrency_parallel.multithreading;

import com.github.javafaker.Faker;

public class Multithreading {
    public void start(){
        Faker faker = new Faker();
        RunnableTutorial firstRunnable = new RunnableTutorial(faker.name().firstName());
        firstRunnable.start();

        RunnableTutorial secondTutorial = new RunnableTutorial(faker.name().firstName());
        secondTutorial.start();
    }
}
