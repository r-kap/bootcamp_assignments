package Multithreading;

    class Q2synmethod {
    private int b=0;
    public static void main(String[] args) {
    Q2synmethod obj = new Q2synmethod();
    obj.manipulate();
    //System.out.println(b);
    }

    public void manipulate()
    {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
            for(int i = 0; i< 10000;++i)
            {
                add();
            }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 10000;++i)
                {
                    sub();
                }

            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("vale of b:"+b);

    }

    public synchronized void add()
    {
        b++;
    }
    public synchronized void sub()
    {
        b--;
    }
}
