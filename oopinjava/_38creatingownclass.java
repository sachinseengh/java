class Details{
    int id;
    String name;
    public void det(){
        System.out.println("id is "+id);
        System.out.println("Name is "+name);
    }
}

public class _38creatingownclass {
    public static void main(String[] args) {
        
        Details  sc=new Details();

        Details  sc2=new Details();
        sc2.name="sachin";
        sc.id=5;
        sc.det();
        sc2.det();
    }
}
