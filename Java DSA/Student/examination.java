package Student;

public class examination {
    int date;
    String subject1,subject2;

    public examination(int date,String subject1,String subject2){
        this.date=date;
        this.subject1=subject1;
        this.subject2=subject2;
    }
    public void show(){
        System.out.println("examination date is "+date);
        System.out.println("subjects are"+subject1+ ", "+ subject2);
    }
}
