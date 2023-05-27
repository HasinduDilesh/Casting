public class CBL {
    void store(){

    }
}
class Cake extends CBL{
    void store(){
        System.out.println("Cake!");
    }
}
class Chocolate extends CBL{
    void store(){
        System.out.println("Chocolate!");
    }
}
class Biscuits extends CBL{
    void store(){
        System.out.println("Biscuit!");
    }
}
class CBLRun{
    public static void main(String[] args) {
    Cake c = new Cake();
    c.store();

    CBL ck = new Cake();
    CBL ch = new Chocolate();
    CBL bs = new Biscuits();
    ck.store();
    ch.store();
    bs.store();
    }
}