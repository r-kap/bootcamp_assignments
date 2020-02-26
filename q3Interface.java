//Q3.Write a program to create a thread using Thread class and Runnable interface each.
package Multithreading;


class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("hello:" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
 class Q3interface {


    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner());
        t1.start();
    }
}

