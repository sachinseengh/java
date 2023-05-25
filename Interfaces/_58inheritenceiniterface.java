
interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface extends sampleinterface{
    void meth3();
    void meth4();
}
class Meths implements childsampleinterface{
    public void meth1(){
        System.out.println("i am meth 1");
    }
    public void meth2(){
        System.out.println("i am meth 1");
    }
    public void meth3(){
        System.out.println("i am meth 1");
    }
    public void meth4(){
        System.out.println("i am meth 1");
    }
    
    

}





public class _58inheritenceiniterface {
    public static void main(String[] args) {
        
    }
}
