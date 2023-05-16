
import java.util.Scanner;

class Employee{
    int salary;
    public int getSalary(){
 
     return salary;
    }
    String name;
    public String getName(){
        return name;
    }
    public void setName(){
      System.out.println("Your current name is "+name);
      System.out.println("Enter your new name");
        Scanner sc=new Scanner(System.in);
        String newname=sc.next();
        name=newname;
        System.out.println("Now your name is "+name);
    }
}

public class _39practiceset {

    public static void main(String[] args) {
        
        Employee emp=new Employee();
        emp.name="Surya";
    
        emp.setName();  
        System.out.println(emp.name);
    }
}
