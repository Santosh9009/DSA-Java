interface vehicle{
    static void wheels(){
        System.out.println("all vehicle has");
    }
}
interface life{
    static void human(){
        System.out.println("all have life");
    }
}

class john implements vehicle,life{
    void wheels(){
        System.out.println("John's vehicle has wheels");
    }
    void life(){
        System.out.println("john has life");
    }
}

public class interf{
    public static void main(String[] args) {
        john j1=new john();
        j1.wheels();
        j1.life();
    }
}
