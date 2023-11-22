package oops;

class banking{
    String name;
    String accounttype;
    int accountno;
    float bal;

    banking(String newname,String accttype,int acctno,float balance){
        name=newname;
        bal=balance;
        accounttype=accttype;
        accountno=acctno;
    }

     void withdraw(float amt){
        if(bal>=amt){
            bal=bal-amt;
            System.out.println("the current balance is "+ bal);
        }else{
            System.out.println("insufficent balance");
        }
    }

     void deposit(float dep){
        bal =bal+dep;
        System.out.println("the new balance is "+ bal);
    }
    void display(){
        System.out.println("name is "+name);   
        System.out.println("account no is "+accountno);   
        System.out.println("accounttype is "+accounttype);   
        System.out.println("bal is "+bal);            
    }
}
public class account2 {

    public static void main(String[] args) {
        banking b=new banking("rupesh","saviing",14325,1000);
        System.out.println(b.bal);
        b.deposit(5000);
        b.withdraw(500);
        b.display();
    }
}
