package Student;

public class result1 {
    int mark;

    public result1(int m1){
        mark=m1;
    }
    public void show(){
        if(mark>=30){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
