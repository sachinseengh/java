
interface Bicycle{
    public void acc(int increase);
  public   void br(int decrease);


}
class Heo implements Bicycle{
  int speed=7;
 public void acc(int increase){
    speed=speed+increase;
  }
  public void br(int decrease){
    speed=speed-decrease;
  }
}




public class _53introductiontointerfaces{
    public static void main(String[] args) {
        

        ///interface is a class type containing empty method
        //lates classes can be made by implenting the inter face
        //all the method should be defined

        Heo hh=new Heo();
        hh.acc(78);
           System.out.println(hh.speed);
    }
} 