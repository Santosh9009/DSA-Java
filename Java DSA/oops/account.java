package oops;

     class bank{
        String name;
        String accounttype;
        int accountno;
        float bal;

         void getdata(){
            name="santosh";
            accountno=123;
            accounttype="saving";
            bal=5000;
            System.out.println(name);
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
     class account {

    public static void main(String[] args) {
        bank b1=new bank();
       // b1.name="binay";
         b1.bal=10000;
         b1.deposit(5000);
         b1.withdraw(500);
         b1.getdata();
         b1.display();
    }
}
