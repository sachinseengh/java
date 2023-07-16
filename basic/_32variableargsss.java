public class _32variableargsss {





// an array is being used as parameter for function means we can send the n number of arguments from calling function
    static int  sum(int ...arr){
        int res=0;
        for(int a:arr){
            res=res+a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("the sum of 1,5,7,8 is "+sum(1,5,7,8) );
    }
}
