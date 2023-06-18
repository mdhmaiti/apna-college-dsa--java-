# ***constructors***

Constructor is  a special method which is invokled automatically at the time of object creation.

1. constructot have the same name as class or structure .
2. constructror don't have a return type.(not even void ).
3. constructr are only called ones during the object creation.
4. memory allocation happens once the constructor is called.

5. In java when we don't define a constructor by ourselves ,java creates a default constructor.
eg. 
 * Pen p1 = new Pen();
  * detail:
     ``` java
         public class OOPS{
        pvsm(String args[]){
        Student s1 = new Student();
        // even if the Studnent constructor isnot defined the java will make the constructor automatically.But the difference is that it does not have a initialized value.
            }
        }
        class Student {
            String name;
            int roll;

            Student(){
                //here the constructor is initialized;
            }

            // the above Student(){ } can also be written like this .given below 
            Student(String name ){
                this.name = name ;

                //note : if i used this to define the constructor i must pass some parameter while difining the new constructor.eg Srudent("Medhashis")

             // third process ; here you dont have to pass anything
             
            Student(){
                System.out.println (" the constructor is called");
            }


            }

        }

        
        
     ```

 ## ***Types of constructor.***

 * *Parameterized constructor*
    The constructor which has a parameter inside them. Defined above.
 * *Non Parameterized constructor*
    No paramenter is passed through them
* *Copy constructor*

***know the concept of constructor overloading*** this is am example of poly morphism.

## ***Copy constructor***
* this is not by deafult in java . this helps to      transfer(copy) all the properties of object 1 to object 2 .
Student S2 = new Student(S1); here we want every properties of s1 to be copied inside the s2.*Note* : for this we also have to make another constructor like Student(Student S1){ } ; other wise the above statement "Student(S1)" holds no meaning , [the constructor is like an object ].

``` java
class Student{
    String name ;
    int roll;
    String password;
    // by default java makes a constructor only when we do not make any other constructor.
    // here we have already created the Student(para),,so here we have to define the Student().Otherwise it will give error.
    Student(Student S1){
        this.name = S1.name;
        this.roll = S1.roll;


    }

      Student(String name){
        this.name = name;
    }


}


```
***note the process of this***
here this.name ( this is a keyword indicate this present object .name is the property of the class that we defined )and the = name is the thing that we actually passed inside the bracket of the constructor.

**the program of the copy constructor is a shallow copy constructor** [shallowCopy](copyConstructor.java).
To copy the data we need the concept of deep copy.

## ***Shallow and deep Copy***

In the english poetic meaning in the shallow changes dont reflect, in deep cpy changes reflect.

``` java
    // this is a  shallow copy constructor 
    Student(Student S1){
        marks = new int[3];
        this.name = S1.name;
        this.roll = S1.roll;
       
        this.marks = S1.marks;

         }

``` 
*To make it a deep Copy*( that copy the data and not just the position)
simply change 
``` java
    // this is a  deep copy constructor 
    Student(Student S1){
        marks = new int[3];
        this.name = S1.name;
        this.roll = S1.roll;
        for(int i =0;i<marks.lenght;i++)
            this.marks[i]= S1.marks[i];
    }

``` 
Now the chabged values wont be reflected inside the S2 constructor.

# ***LAZY COPY*** off topic.
Lazy copy, also known as copy-on-write, is a technique used in computer programming to optimize the copying of data structures. It involves deferring the actual copying of data until it is necessary to modify or access the data.

In a lazy copy approach, when a copy of an object or data structure is requested, instead of immediately creating a separate copy, a reference to the original data is created. The copy operation is deferred until the point where either the original or the copy needs to be modified. At that moment, the data is copied, and the modifications are made independently to the copied version, ensuring that the original data remains unchanged.

The purpose of lazy copy is to minimize unnecessary memory and processing overhead that would be incurred by making a full copy of the data structure upfront. It is particularly useful when dealing with large data structures that are read more frequently than they are modified.

Lazy copy can be implemented using various mechanisms depending on the programming language and data structure involved. For example, a common approach is to use reference counting or similar techniques to track the number of references to the original data. When a modification is required, a copy is made at that point to ensure that the original data remains unaffected.

By employing lazy copy, the overhead of copying large data structures is reduced, leading to improved performance and reduced memory usage in scenarios where copying is infrequent. However, it is important to note that lazy copy introduces potential complexities in managing shared mutable state, as multiple objects may hold references to the same underlying data until modifications occur.

Overall, lazy copy is a technique that balances the trade-off between performance and memory usage, deferring the copying of data until necessary while maintaining data integrity.

Certainly! Let's consider an example of a class called `DataStructure` that stores a large array of integers. We will implement lazy copy functionality using the copy-on-write technique.

```java
public class DataStructure {
    private int[] data;

    public DataStructure(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public DataStructure copy() {
        // Create a shallow copy with the same reference to the original data
        DataStructure copy = new DataStructure(this.data);
        return copy;
    }
}
```

In the example above, the `DataStructure` class has a private `data` member variable that holds an array of integers. The class includes a copy constructor-like method called `copy()`.

The `copy()` method creates a shallow copy of the `DataStructure` object by simply assigning the reference of the original `data` array to the copied object. This means that both the original object and the copied object will initially share the same array.

Now let's see how the lazy copy works in practice:

```java
int[] originalData = {1, 2, 3, 4, 5};
DataStructure originalObject = new DataStructure(originalData);

// Create a copy using the copy() method
DataStructure copiedObject = originalObject.copy();

// Modify the copied object's data
int[] copiedData = copiedObject.getData();
copiedData[0] = 10;

// Verify that the original data remains unchanged
System.out.println("Original data: " + Arrays.toString(originalObject.getData()));
System.out.println("Copied data: " + Arrays.toString(copiedObject.getData()));
```

In this example, we create an `originalObject` with an array of integers. Then we use the `copy()` method to create a `copiedObject`, which initially shares the same `data` array as the original.

Next, we modify the first element of the `copiedData` array to 10. Since the `copy()` method only created a shallow copy, this modification affects only the copied object, leaving the original object's data intact.

When we print the data from both objects, we can see that the modification made to the copied object does not affect the original object:

```
Original data: [1, 2, 3, 4, 5]
Copied data: [10, 2, 3, 4, 5]
```

This example demonstrates the lazy copy technique where the actual copying of the data is deferred until the point where a modification is made.


# ***Destructors***
* Interview
    * "Dunia mein balance bohot jaruri hota hai" ~ Thanos.
    * If constructor creates an object then the distructor deletes it from the memory.In java we dont have this because java has something called the garbage collector which automatically deletes the thing which are not used or not important.

# ***INHERITANCE***
    Inheritance is when the properties and the methods of the "base(parent)" class are passed on to the "derived(child)" class.

example: inheritance of the classes inside which there are objects.

``` java
        pvsm(....){
            Fish shark = new Fish();
            shark.eat();//it will auto inherit .

        }
    //base class
    class Animal{
        String color;
        void eat() {
            System.out.println("eats");
        }
        void breathe(){
            System.out.println("breathes");
        }
    }

    //Derived class
    
    class Fish extends Animal { //it gets all the properties from the animals .
        int fins;

        void swims(){
            Syso("Swims in water");
        }
    }

```
**note : the class inheritance uses the *"extends"* keyword**

## ***Types of inheritance***
        * Single level.
        * multi level.

 the above example of the inheritance is single level interitance .

 Multi level inheritance:  here mamal inherit the animal and the dog inherit the mammal.    

 
``` java
        pvsm(....){
            Dog doggy = new Dog();
            doggy.eat();//it will auto inherit . It inherits a object.
            doggy.legs =4; // It inherits a property of the class.

        }
    //base class
    class Animal{
        String color;
        void eat() {
            System.out.println("eats");
        }
        void breathe(){
            System.out.println("breathes");
        }
    }

    //Derived class
    
    class Mammal extends Animal { //it gets all the properties from the animals .
        int legs;

     }
     
     class Dog extends Mammal {
        String breed;

     }

```

``` java 
    output : eats
    4
```

***Hierarchial inheritance***( this is the easiest of all inheritance )
        single base class and multiple derived class.Eg ~ animal ..all the fish ,bird, mammal are animals ...but they have the different properties ..but all of them eat breath . Eg ~ class bird extends animals , class fish extends animals ..now under them they have different properties .. but they all eat and breath which is the basic properties of the animal .

***Hybrid inheritance***.
        1 animal
        2 fish Bird Mammal
        3 2.1 tuna shark 2.2 peacock 2.3 cat dog         

----------------------------------
# ***POLYMORPHISM***
            when we try to do the things in multiple forms.
            * compile type polymorphism (static)
            * run time poly morphism (dynamic)

**Method overloading**
    multiple functions with same name but different parameter .
    eg -  int sum( int ,int)   int sum(int int int) float sum (float,float.float)   
**Method overriding**
    Parent and child classes both contain the same function with different defination.
    . eg ~ 
    
``` java 
class Animal{ 
void eat (){ "eat anything "}}
class Deer{
void eat (){"eats grass "}}

-------

Deer d = new Deer();
d.eat();

// This will print "the eat grass"
```
# ***Abstraction***
        Hiding the unnecessary details and showing only the important parts to the user. * abstract classes * interfaces. It gives the idea to how to implement the things.
***general questio** : what is the difference between the encapsulation and abstraction ?
~ encapsulation helps to wrap up the data and hepls to implement the data hiding . whereas the helps to show the important data and hide the necessary data .

## abstract classes
 * cannot create an instance(object) of the abstract classes 
 * can have the abstract / non- abstract methods
 * can hav constructors.

# interfaces
        we know that class is a blueprint of object. Then the interface is a blueprint of a class.

        1. all methods are public,abstracts and without implementation.
        2. used to achieve the total abstraction.
        3. variables in the interface are final ,public and static.
***uses***
* to implement multiple inheritnce.
* total abstraction 
* for the class we use the key word ``` extends ``` and for the interfaces we use the word ``` implements ```.  
* a chess player program is given to under stand the interface 

## implementing multiple inheritance.
```java
    interface Heribivore {

    }
    interface Carnivore {

    }
    class Bear implements Herbivore, Carnivore {

    }
```

# Static Keyword.

        Static keyword in Java is used to share the same variable or method of a given class.

# super keyword.
        super keyword is used to refer the immediate parent class object.
        - to access parents properties
        - to access parents functions
        - to access parents constructor

general idea .

``` java 
    public class superKey {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}
// creating a class
class Animal {
    Animal(){
        System.out.println("animal constructor is called");

    }
}

class Horse extends Animal {
    // creating a constructor
    Horse(){

        super();// here the java by deafult calls the parent class first then the child class 
        // u can say the java used the super by default.
        System.out.println("horse constructor is called ");

    }
} 
```
another use : -> 
``` java

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
```
here the above example is to access the property of the parent class.


-------------------------------

***some notes***
``` java 
    class Vehicle{}
    class Car extends Vehicle{}
    // if the above are the child class and the parent class respectively then
    // all the object creation method listed below are correct .
    // right side -> object creation ; and left side -> reference ;
     Car c = new Car();
     Vehicle v = new Vehicle();
     Vehicle v = new Car(); // child class aa ai rokhm vabe pass korte para;== parent ar reference aa child ar object store hocche ;but the vice versa not possible 
```
     



