public class _27_foreach {
    public static void main(String[] args) {
        int [] marks2={12,15,1,41,51,5};
        System.out.println(marks2.length);
        String []name={"sachin","kumar","singh"};
        System.out.println(name.length);
        System.out.println(name[1]);



        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        
            
    
            
        for (String element : name) {
            System.out.println(element);
            
        }
    }
}
