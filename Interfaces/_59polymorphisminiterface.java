
interface Camera{
    void takeSnap();
    void recordVideo();
   default void snap4k( ){
           System.out.println("recording in 4k");
   }
}
interface Wifi{
    String[ ] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("connnecting......");
    }
}
class MySmartPhone extends MyCellPhone implements Wifi,Camera{
   public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }
    public String[] getNetworks(){
        System.out.println("getting list of networks");
        String[] networkList={"harry","prashanth","anjali5g"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to "+network);
    }
    public void snap4k(){
        System.out.println("i am a overridden snap 4k");
    }
}




public class _59polymorphisminiterface {
    public static void main(String[] args) {
        Camera ms=new MySmartPhone();
        // ms.callNumber(989898989); --->not allowed for us
        // ms.takeSnap();
        Wifi w=new MySmartPhone();
        w.connectToNetwork("airtel");




    }
}












