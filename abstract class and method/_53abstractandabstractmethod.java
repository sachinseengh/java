

abstract  class Base2{
    public Base2(){
        System.out.println("i  am a constructor ");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void gt();
}
class Subbase extends Base2{
@Override
    public void gt(){
        System.out.println("hello");
    }
}
// class Sub2 extends Base2{
abstract class Sub2 extends Base2{
    public void th(){
        System.out.println("hello this is em");
    }
}



public class _53abstractandabstractmethod {
    public static void main(String[] args) {
          Subbase sub=new Subbase();
        //   sub.gt();
        // Sub2 s=new Sub2();
        // s.th(); 

    }
}
