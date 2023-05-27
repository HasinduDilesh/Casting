public class Parent {
    String name;
    void display(){
        System.out.println("Super Class Is Running!");
    }
}
class Child extends Parent{
    int age;
    void display(){
        System.out.println("Sub Class Is Running!");
    }
}
class Downcasting {
    public static void main(String[] args) {
        Parent p = new Child(); //Upcasted Object
        p.name = ("Gawesh!");
        Child c = (Child) p; //Downcasted Object
        c.age =  25;
        System.out.println(p.name);
        System.out.println(c.age);
        p.display();
    }
}