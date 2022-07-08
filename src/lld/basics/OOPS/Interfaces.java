package lld.basics.OOPS;

public class Interfaces implements Car1, Person{
    public static void main(String[] args) {
        Interfaces transformer = new Interfaces();
        transformer.start();
//        transformer.Walk();
    }

    @Override
    public void start() {
        System.out.println("Started");
    }

//    @Override
//    public void start() {
//        System.out.println("walk");
//    }
}

interface Car1{
    void start(); // by default public abstract
}

interface Person{
    void start();
}