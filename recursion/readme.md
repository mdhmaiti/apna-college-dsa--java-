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