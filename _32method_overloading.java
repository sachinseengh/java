public class _32method_overloading {


static void telljoke(){
    System.out.println("my name");
}
static void change(int []arr2){
    arr2[0]=51;
}

    public static void main(String[] args) {
        telljoke();
        ///when array is passed into method it changes the original elements and doesnot change the value of variable it is applicable in array





        //when the variable is passed into the method the value is copied into the method argument 
       int []arr={1,2,5,5,8};
        change(arr);
        System.out.println("value is "+arr[0]);
    }
}
