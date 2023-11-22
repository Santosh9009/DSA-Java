package oops;
class shape{
    double perimeter(){
        return 0;
    }

    
    double area(){
       return 0;
    }
}  


class triangle extends shape{
    double l,b,h,s,area;

    triangle(double length,double breath,double height){
        l=length;
        b=breath; 
        h=height;
    }

  double area(){
     s=(l+b+h)/2;
     area=Math.sqrt((s-l)+(s-b)+(s-h));
    System.out.println("area of triangle inside is "+area);
    return area;
  }
    double perimeter(){
    System.out.println("perimeter of triangle inside is "+(l+b+h));
    return (l+b+h);
   }
}
class rectangle extends shape{
    double l,b;
  rectangle(double length,double breath){
    l=length;
    b=breath;
  }
  double area(){
    System.out.println("area of rectangle inside is "+l*b);
    return l*b;
  }
    double perimeter(){
        System.out.println("perimeter of rectangle inside is "+2*(l+b));
        return 2*(l+b);
    }
  }
  

class square extends shape{
    double l;
    square(double length){
        l=length;
    }
    double area(){
        System.out.println("area of square inside is "+l*l);
        return l*l;
      }
      double perimeter(){
        System.out.println("perimeter of square insideis "+4*l);
        return 4*l;
    }
    }


public class box{
    public static void main(String[] args) {
        shape s=new shape();

        rectangle r=new rectangle(10,20);
        square sq=new square(10);
        triangle t=new triangle(3,4,5);
        
        shape ref;
        ref=r;
        ref.area();
        ref.perimeter();

        ref=sq;
        ref.area();
        ref.perimeter();

        ref=t;
        ref.area();
        ref.perimeter();
        

    }
}
