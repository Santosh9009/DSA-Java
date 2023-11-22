package oops;
 class student {
    int rollno;
    String name;
    student(){
        rollno =456;
        name="santosh";
    }
}

interface sport{
    float sportwt=(float) 2.4;
    void putwt();
}
class test extends student{
    float mark1,mark2; 
    void getmark(float m1,float m2){
        mark1=m1;
        mark2=m2;
    }
}
class result extends test implements sport{
    float total;
    public result() {
    }
    public void putwt(){
        System.out.println("sport weightage is "+sportwt);
    }
    void display(){
        total =mark1+mark2+sportwt;
        System.out.println("Name- "+ name);
        System.out.println("rollno- "+rollno);
        System.out.println("totalmark "+total);
    }
    public void show() {
    }
}

class multipleinheritance{
    public static void main(String[] args) {
        result r=new result();
        r.getmark(98.0f,7);
        r.display();
        r.putwt();
    
    }
}