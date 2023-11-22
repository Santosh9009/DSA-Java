import Student.*;
import College.*;

public class info {
    public static void main(String[] args) {
        Student_info i1=new Student_info("Rohit",66,"2nd");
        i1.show();
        examination e1=new examination(12,"math","Physics");
        e1.show();
        result1 r1=new result1(94);
        r1.show();
        collegeinfo c1=new collegeinfo("bhawanipatna");
        c1.show();
    }
}
