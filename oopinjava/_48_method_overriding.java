
   // method overriding means when u inherit a class B from  a classs A then all the method of class A is copied to Class B.

    //And suppose the class B have the same method as of A then to run the method of b use have use override @override



    //inherit all the method of A but 

    class A{
        public void meth (){
            System.out.println("i am method 1 of A");
        }
    
        public void meth2(){
            System.out.println("I am method 2 of A");
        }
    }
    class B extends A{
    // @Override
        public void meth2(){
            System.out.println("I am method 2 of B");
        }
    }



public class _48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2(); 


        B b = new B( );
        b.meth2();
    }
}
