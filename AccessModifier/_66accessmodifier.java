// package AccessModifier;



class C1{
    public int x=5;
    int y=4;
    private int a = 78;
    protected int b= 56;
    public void meth(){
        System.out.println(a);
}
}





class C2 extends C1{

}
public class _66accessmodifier {
    public static void main(String[] args) {
        
        C1 cc = new C1();
        // cc.meth();
        System.out.println(cc.x);
        System.out.println(cc.y);
        System.out.println(cc.b);
        // System.out.println(cc.a);
        C2 c = new C2();
        System.out.println(c.y);

    }
}
