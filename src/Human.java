public class Human {
    void printData(){
        System.out.println("Method Of Super class!");
    }
}
class Man extends Human{
    void printData(){
        System.out.println("Method Of Sub class!");
    }
}
class Test{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Man();
        h.printData();
        h1.printData();
    }
}