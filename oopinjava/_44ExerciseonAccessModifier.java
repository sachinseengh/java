

class Rectangle{
    private int length;
    private int breadth;

//if there is no value set for length and breadth then the value of constructor will be default
public Rectangle(){
    length=4;
    breadth=5;
}
public Rectangle(int a,int b){

    length=a;
    breadth=b;
}
public int getLength(){
 return length;
}
public int getBreadth(){
    return breadth;
}


}



public class _44ExerciseonAccessModifier {
   
    public static void main(String[] args) {

        //we want custom value of length 
         Rectangle r=new Rectangle();
        //  Rectangle r=new Rectangle();
         System.out.println(r.getBreadth());
         
    }
}
