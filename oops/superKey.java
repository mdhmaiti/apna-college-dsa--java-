package oops;

public class superKey {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);// it will print the horse color 
    }
}
// creating a class
class Animal {

    String color;
    Animal(){
        System.out.println("animal constructor is called");

    }
}

class Horse extends Animal {
    // creating a constructor
    Horse(){

        super.color = " brown";// accessing the immdiate parent class property
        System.out.println("horse constructor is called ");

    }
}