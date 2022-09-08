package com.kda.Multithreading.DZ1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Dump dump = new Dump();
        Scientist scientistOne = new Scientist();
        Scientist scientistTwo = new Scientist();

        Thread minionOne = new Thread(new Minion(dump, scientistOne));
        Thread minionTwo = new Thread(new Minion(dump, scientistTwo));

        minionOne.start();
        minionTwo.start();

        minionOne.join();
        minionTwo.join();

    }
}
