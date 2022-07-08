In procedural single code is responsible for whole system
In OOP we will segregate the objects on the basis of their responsibilities

Encapsulation - Encapsulation in Java is an object-oriented procedure
                of combining the data members and data methods of the class inside the user-defined class.
                All the attributes should be private we gave access through methods.
                from this method we can define restriction like set age only if > 0 in method.

class User{
    private String firstName, lastName;
    private Address address;
    private int age;

    public void setAge(int age){
        if(age>0){
            this.age = age;
         }
    }
}

class UserService{
    public void setUserAge(User user){
        user.setAge(-20); // age will not set
        user.age = -20; //wrong
    }
}






Abstraction - only show the intended details like only show accelerator cluch etc not need to know engine
              implementation. we can use abstract class or interface there







Inheritance - inherit same properties from the parent class. eg. in car class along with 3 properties it has
              its own two properties as well.

class Vehicle{
    public int fuelAmount;
    public int capacity;
    public void applyBreaks(){}
}

class Car extends Vehicle{
    public int fuelAmount;
    public void noOfWheels(){}
}






Polymorphism - Poly - many. Morphism - forms ie. many forms. ie Polymorphism means same object will have many
               forms during compile time or run time.


// run time polymorphism
abstract class Animal{
    abstract void speak();
}

class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("woof");
    }
}

class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow");
    }
}

class AnimalService{
    public void speak(){
        Animal animalObj = new Dog();
        animalObj.speak();
    }
}