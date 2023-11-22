public class troll {
   static void roll(int r,int c){
    if(r==0 ){
        return;
    }
    if(c<r){
        roll(r,c+1);
        System.out.print("*");
    }
    else{
        roll(r-1,0);
        System.out.println();
    }
   }  
public static void main(String[] args) {
    roll(4,0);
}
}
