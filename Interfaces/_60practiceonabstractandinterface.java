     //---------------question-1--------------
// abstract class Pen{
//     abstract public void write();
//     abstract public void refill();
// }

// class Pen2 extends Pen{
//    public void write(){
//     System.out.println("writtting......");
//    }
//    public void refill(){
//     System.out.println("refilling");
//    }
// }

// public class _60practiceonabstractandinterface {
//     public static void main(String[] args) {
//         Pen2 pp = new Pen2();
//         pp.write();
//     }
// }

//---------------------question-2-----------
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println(
            "jumping"
        );
    }
    void bite(){
        System.out.println("Biting");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating........");
    }
    public void sleep(){
        System.out.println("Sleeping..");
    }
}
class _60practiceonabstractandinterface{
    public static void main(String[] args) {
        BasicAnimal h = new Human();
        // h.bite();----because of the polymorphism
    }
}