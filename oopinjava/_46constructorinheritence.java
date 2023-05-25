class Base1{


    public Base1(){
        System.out.println("i am a constructor");
    }
    public int id;

    public int getId(){
        return id;
    }
    public void setId(int n){
        id=n;
    }
}
class Derived extends Base1{
  public int id2;
  public void setId2(int n){
    id2=n;
  }
  Derived(){
    System.out.println("I am a derived class");
  }
  //overloading constructor
  Derived(int n){
System.out.println("i am a over loaded constructor "+n);
  }
}






public class _46constructorinheritence{
    public static void main(String[] args) {
        // Base1 bb=new Base1();
        // Derived dd=new Derived();
        //it the derived class doesnot have a constructor then the constructor of main class will be invoked and if both have the constructor then both will run

        Derived dd=new Derived(5);
        // Base1 bb=new Base1();
        

        //first the constructor of base class will be executed and then only the constructor of derived class is executed
    }
}