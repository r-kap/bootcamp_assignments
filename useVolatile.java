//Q1.Write a program do to demonstrate the use of volatile keyword.
package Multithreading;

import java.util.Scanner;

class Demovolatile extends Thread{
    private volatile boolean counting = true;
    private int count = 1;
    public void run()
    {
        while(counting)
        {
            System.out.println(count);
            count++;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void stopCounting()
    {
        counting=false;
    }
}

     class Usevolatile {
    public static void main(String[] args) {

       Demovolatile t1 = new Demovolatile();
        t1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        t1.stopCounting();



    }

}
