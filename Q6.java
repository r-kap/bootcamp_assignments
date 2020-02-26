package Multithreading;

// Write a program to demonstrate sleep and join methods.

class Mythread extends Thread{
    public void run(){
        for(int i=1 ; i<=5; i++){
            try{
                Thread.sleep(500);
            }
            catch(Exception e){System.out.println(e);}
            System.out.println(this.getName() + " " + i);
        }
    }
    public static void main(String args[]){
        Mythread t1=new  Mythread();
        Mythread t2=new  Mythread();
        Mythread t3=new  Mythread();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){System.out.println(e);}
        t2.start();
        t3.start();
    }
}
