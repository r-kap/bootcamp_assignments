package Multithreading;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Lock;

class App{
    private ArrayList<Integer> al = new ArrayList<>();
    private ArrayList<Integer> al1 = new ArrayList<>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();


    public Random random = new Random();

    public void stageOne()
    {
        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            al.add(random.nextInt(100));
        }

    }

    public void stageTwo()
    {
       synchronized (lock2)
       {
           try {
               Thread.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           al1.add(random.nextInt(100));
       }
    }

    public void  process()
    {
        for(int i =0;i<1000;++i)
        {
            stageOne();
            stageTwo();
        }
    }
    public void myfunc()
    {
        System.out.println("starting.......");
        long start = System.currentTimeMillis();
        process();
        long stop = System.currentTimeMillis();

        System.out.println("time taken:"+(stop-start));
        System.out.println("size of list 1:"+al.size()+"and size of list 2:"+al1.size());
    }

}
    class Q2block {
    public static void main(String[] args) {
        App obj = new App();
        obj.myfunc();
    }
}
