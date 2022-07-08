package lld.basics.OOPS;

// abstraction
public class Abstraction {
    public static void main(String[] args) {
//        Car c1 = new Car(); //no need of car object as car is a concept but audi and bmw are actual models
        // so we will create the object of actual models.
        Audi a1 = new Audi();
        a1.start();

    }
}

/*
   1. Abstract function must be overriden in child classes like interface functions
   2. Abstract function should only be prresent inside abstract class
   3. we can crete concrete functions inside abstract class but not in interfaces
 */

class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi is starting");
    }
}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW is starting");
    }
}

abstract class Car{
    int price;
    abstract void start();

    void breaks() {
        System.out.println("break");
    }
}