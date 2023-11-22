package oops;
class Runnablethread1 implements Runnable{
    Runnablethread1(String name){
    }
    public void run(){
        int i=0;
        try{
        while(i<20){
            System.out.println("i am thread1");
            i++;
        }
    }
    catch(Exception e){
        System.out.println("invalid");
    }
    }
}

class Runnablethread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("i am thread2");
            i++;
        }
    }
}

public class runnable {
    public static void main(String[] args) {
        Runnablethread1 r1=new Runnablethread1("");
        Thread t1=new Thread(r1,"harri");


        Runnablethread2 r2=new Runnablethread2();
        Thread t2=new Thread(r2);

         System.out.println("the name of the thread is "+t1.getName());
    }
}
