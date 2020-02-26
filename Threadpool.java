package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Even implements Runnable{
int num = 1;
    public void run(){
        while(true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num % 2 == 0 && num<=10) {
                System.out.println(num);
            }
            num++;
        }
    }
}

class Odd implements Runnable{
    int num = 1;
    public void run(){
        while(true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num % 2 != 0 && num<=10) {
                System.out.println(num);
            }
            num++;
        }
    }
}

public class Threadpool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Even());
        executorService.submit(new Odd());

        executorService.shutdown();
    }
}
