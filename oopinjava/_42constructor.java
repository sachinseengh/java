
class Sachin{
    private int id;
    //This is constructor
    public  Sachin(){
        id=4;
    }
    public int getId(){
        return id;
    }
}


public class _42constructor {
    public static void main(String[] args) {
    Sachin sc=new Sachin();
System.out.println(sc.getId());

    }
}
