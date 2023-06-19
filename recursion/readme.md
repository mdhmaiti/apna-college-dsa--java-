# recursion .
   recursion is the basics of almost every  thing .--> in simple words it is a thing that calls it self.IT IS THE MOST IMPORTANT PART.


## general misconception .

``` java
public static void main(String[] args) {
    message();
}

static void message() {
    System.out.println("hello");
}
```
==>> ``` if i don't write static will it run ?```
If you don't write the `static` keyword before the `message` method, the code will not compile successfully. The reason is that the `main` method is declared as `static`, and it is trying to call the `message` method directly without creating an instance of the class.

If you remove the `static` keyword from the `message` method, you will encounter a compilation error. This is because the `main` method, which is `static`, cannot call a non-static method directly. Non-static methods are associated with instances of a class and require an object to be invoked.

To resolve the compilation error, you have a few options:

1. Declare the `message` method as `static`: If the `message` method does not depend on any instance-specific state or variables, you can declare it as `static` to allow the `main` method to call it directly without creating an instance of the class.

```java
public static void main(String[] args) {
    message();
}

static void message() {
    System.out.println("hello");
}
```

2. Create an instance of the class and call the non-static method: If the `message` method relies on instance-specific variables or behavior, you would need to create an instance of the class and call the method on that instance.

```java
public static void main(String[] args) {
    MyClass myObject = new MyClass();
    myObject.message();
}

void message() {
    System.out.println("hello");
}
```

In summary, if you want to call a method directly from the `main` method without creating an instance of the class, you need to declare that method as `static`. Otherwise, you would need to create an instance of the class and call the non-static method on that instance.

# why use the recursion?
1. it helps in solving bigger and complex problems in simple way.
2. you can convert the recursion to the iteration and vise versa.
3. space complexity is not constant due to the recursive calls.

# example of recurcion .

printing numbers .``` if there is a problem in the  understanding just use the debugger tool and understand the call stack :the main point is after the function is called the function always left the stack```

``` java 
    // this is a perfect example of using the recursion
    public class printing {
    public static void main(String[] args) {

        // this is a simple program that print number 12345 by using the recursion.
        print(1); // passing the value of n = 1 ; in the function

        
    }
    
public static void print(int n) {
    if(n== 5){ // this statement is the base statement .
        System.out.println(5);
        return ; // if n = 5 then return to the previous 
    }
    System.out.println(n);// print the num that is given in the input.
    // again calling the same function by increasing the value by 1
    print(n+1);
    
}

    
}

```