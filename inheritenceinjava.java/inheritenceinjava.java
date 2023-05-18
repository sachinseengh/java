
class Animal{
    boolean bark;
    String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
class Dog extends Animal{
    String nickname="micheal";
}



public class inheritenceinjava {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setName("Tommy");
        System.out.println(d.getName());
    }
}
