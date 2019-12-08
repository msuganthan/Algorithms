package com.suganthan.inteviews;

/**
 * Created by msuganthan on 7/9/19.
 */
public class Racer implements Runnable {
    private String name;


    Racer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println(name);
        } catch(InterruptedException e) {

        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new Racer("1"));
        Thread t2 = new Thread(new Racer("2"));
        Thread t3 = new Thread(new Racer("3"));
        Thread t4 = new Thread(new Racer("4"));
        Thread t5 = new Thread(new Racer("5"));

        t5.start();
        t3.start();
        t1.start();
        t3.join();
        t2.start();
        t1.join();
    }
}
