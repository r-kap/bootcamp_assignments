//Q3.Write a program to create a thread using Thread class and Runnable interface each.
package Multithreading;
class Myclass extends  Thread{
    public void run()
    {
        for(int i = 0; i<10;++i)
        {
            System.out.println("hello:"+i);
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

        }
    }
}
    class Q3class {
    public static void main(String[] args) {
        Myclass m = new Myclass();
        m.start();

    }
}
