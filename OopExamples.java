// abstraction
class Counter {
    // encapsulation
    // private modifier used to hide this attribute's changeability from outer classes
    private int count;

    // setter method
    // to modify the count attribute with control
    public void setCount() {
        this.count += 1;
    }

    // getter method
    public int getCount() {
        return this.count;
    }
}

// inheritance
class Animal {
    // protected modifier to make this attribute only accessible from subclasses (child class)
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    // eat method will be inherited from the subclasses
    protected void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// polymorphism
class Vehicle {
    protected String name;

    Vehicle(String name) {
        this.name = name;
    }

    public void fuel() {
        System.out.println(name + " use fuel");
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    // same method from parent class with different implementation
    public void fuel() {
        System.out.println(name + " use petroleum");
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    // same method from parent class with different implementation
    public void fuel() {
        System.out.println(name + " use manpower");
    }
}

public class OopExamples {
    public static void main(String[] args) {
        Dog dog = new Dog("Sparkie");
        dog.eat();
        dog.bark();

        Counter count = new Counter();
        count.setCount();
        System.out.println(count.getCount());

        Car car = new Car("Lambo");
        Bike bike = new Bike("Tsunami");
        car.fuel();
        bike.fuel();
    }
}