import java.util.Arrays;

public class search {
    public static void main(String[] args) {
        int count =0;
        String name="my name is name";
        String target="name";
        String[] word=name.split(" ");
        System.out.println(name);

        for(int i=0;i<word.length;i++){
        if(target.equals(word[i])){
            System.out.println("target is present at index :"+i);
            count++;
        }
    }
    System.out.println("count is :"+count);
    }
}
