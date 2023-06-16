package oops;

public class typesOfConstructor {
    public static void main(String[] args) {

        //Student S1= new Student();
        //Student S2 = new Student("Medhashis");
        //Student S3 = new Student(007);
        //Student S4 = new student("medhashis",007). this line will give error as we have not defined it .



        
    }
    
}
class Student{
    String name ;
    int roll;
    // by default java makes a constructor only when we do not make any other constructor.
    // here we have already created the Student(para),,so here we have to define the Student().Otherwise it will give error.
    
    Student(){
        System.out.println("constructor is called...");

    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll= roll;
    }

}
