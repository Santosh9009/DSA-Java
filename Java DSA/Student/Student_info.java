package Student;

public class Student_info {
    String name;
    int regno;
    String year;

    public Student_info(String name1,int roll,String yr){
        name=name1;
        regno=roll;
        year=yr;
    }
    public void show(){
        System.out.println("name is "+name);
        System.out.println("registration no is "+regno);
        System.out.println("year is "+year);
        
    }

}