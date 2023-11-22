package oops;
 class NL {

    public Node head=null; 

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node curnode=head;
        while(curnode.next!=null){
            curnode=curnode.next;
        }
        curnode.next=newnode;
    }
    public void printlist(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }

        Node curnode=head;
        while(curnode!=null){
            System.out.print(curnode.data+"->");
            curnode=curnode.next;
        }
        System.out.print("Null");
    }



    public static void main(String[] args) {
        NL list=new NL();
        list.addfirst("santosh");
        list.addfirst("rajesh");
        list.printlist();
        System.out.println();
        list.addlast("suresh");
        list.printlist();

    }
}
