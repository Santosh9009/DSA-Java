public class newwer {
    public static void main(String[] args) {
        String name="water";
        char[] n=name.toCharArray();
        int size=n.length;

    for(int i=0;i<size/2;i++){
        char temp=n[i];
        n[i]=n[size-1];
        n[size-1]=temp;
        size--;
    }
    for(int i=0;i<n.length;i++){
        System.out.print(n[i]);
    }
    }
}
