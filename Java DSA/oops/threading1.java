package oops;
class Mythread1 extends Thread{
    Mythread1(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("mythread1 is running");
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("mythread2 is running");
        }
    }
}
 
public class threading1 {
    public static void main(String[] args) {
        Mythread1 m1=new Mythread1("harring");

        System.out.println("the name of the thread is "+m1.getName());

    }
}
