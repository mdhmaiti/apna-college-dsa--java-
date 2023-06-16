package oops;

public class abstractLook {
    
    public static void main(String[] args) {
        // creating a instance(objects)
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);// it wlll print the default color of animal and not the color of the horse.
        //this is the benefit of having a constructor .
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        // you cannot make Animal a = new Animal();
        // as it is an abstract class and it cannot create an object.
        // error debe.
        //-------------------
        Mustang myHorse = new Mustang();
        //hirarchy -- Animal -> Horse -> Mustang 
        //what this object will do ?
        // it wll perform (here print) all three top to bottom 
    
    }

}

abstract class Animal {
    //non-abstract
    void eat() {
        System.out.println("animal eats");// this is a implementation
    }
    // abstract method ~ we are not writing the implementation 
    abstract void walk();
    // it means that every animal must have a walk function but 
    // how to walk or how to implement the walk is to be defined by the sub classes.
    //it makes it compulsory for the sub classes to have the walk functionor it will give the error.

    //---------------creating(defining) constructor

    String color;

    Animal() {
        color ="brown";
        System.out.println(" animal constructor is called");
    }


}


// creating subclasses
 class Horse extends Animal {
    Horse(){
        System.out.println("horse const is called");
    }
    void walk() {
        System.out.println("walks on four legs");
         
    }

    void changeColor(){
        color ="dark brown";
    }

 }
 class Chicken extends Animal {
    void walk() {
        System.out.println(" walks on two legs");
    }
    void changeColor() {
        color = " yellow";
    }

 }
 class Mustang extends Horse {
    Mustang(){
        System.out.println("mustang const is called");
    }

 }
