public class _13_01_stringpractice {
    





    public static void main(String[] args) {
        String str="Hello <name>";
        String name="sachin";
        // System.out.println(str.toLowerCase());
        // System.out.println(str.replace(" ","_"));
       System.out.println(str.replace("<name>",name));
    }
}
