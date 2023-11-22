package linklist;

 public class LL {
    public Node head=null;
    public Node tail=null;
    public int size;

    public LL(){
        this.size=0;
    }

      class Node{
        public int value;
        public Node next;
     
        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }  
        public void insert(int value,int index){
            if(index==1){
                insertfirst(value);
                return;
            }
            if(index==size){
                insertlast(value);
                return;
            }
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node node=new Node(value, temp.next);
            temp.next=node;
            size++;
        }
        public void insertlast(int value){
            if(tail==null){
                insertfirst(value);
                return;
            }
            Node node=new Node(value);
            tail.next=node;
            tail=node;
            size++;
        }

        public void insertfirst(int value){
            Node node=new Node(value);
            node.next=head;
            head=node;
            if(tail==null){
                tail=head;
            }
            size++;
        }

        public void display(){
            if(head==null){
                System.out.print("list is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            System.out.print("END");
        }

        public int deletefirst(){
            int val=head.value;
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return val;
        }

        public Node get(int index){
            Node node =head;
            for(int i=0;i<index;i++){
                node=node.next;
            }
            return node;  
        }
        public int deletelast(){
            if(size<=1){
                return deletefirst();      
            }
            Node secondlast=get(size-2);
            int val=tail.value;
            tail=secondlast;
            tail.next=null;
            size--;
            return val;
        }
}
