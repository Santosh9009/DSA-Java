package linklist;

public class Real{
    public static void main(String[] args) {
        LL list=new LL();

        list.insertfirst(5);
        list.insertfirst(6);
        list.insertfirst(66);
        list.insertlast(9);
        list.display();
        System.out.println("size is"+list.size);
        System.out.println();
        System.out.println(list.deletefirst());
        list.display();
        System.out.println("size is "+list.size);
        System.out.println();
        System.out.println(list.deletelast());
        System.out.println("size is "+list.size);
        list.display(); 
    }
}