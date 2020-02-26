package Multithreading;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Q7 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer>  future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random r = new Random();
                int d = r.nextInt(5000);
                if(d  > 1500){
                    throw  new IOException("taking too long");

                }
                System.out.println("starting....");
                try{
                    Thread.sleep(d);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("finished");
                return d;
            }
        });

        executor.shutdown();
            try {
                System.out.println("result is:"+future.get());
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            catch (ExecutionException e)
            {
                IOException ex = (IOException) e.getCause();
                System.out.println(ex.getMessage());
            }

    }
}
