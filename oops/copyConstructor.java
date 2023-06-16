package oops;

public class copyConstructor  {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Student S1= new Student();
        S1.roll = 123;
        S1.name = "medhashis";
        S1.password = "java";
        S1.marks[0]=100;
        S1.marks[1]=50;
        S1.marks[2]=87;

        Student S2 = new Student(S1); 

        S1.marks[2]= 6; // we are changing the marks after creating the object,
        //but it changes the output as the copy constructor only copies the address of the data and not the data .
        


        S2.password = "xyz";



        //print the marks of s2 
        for(int i =0; i<3;i++)
            System.out.println(S2.marks[i]);
        
        
        //Student S4 = new student("medhashis",007). this line will give error as we have not defined it .



        
    }
    
}
class Student{
    String name ;
    int roll;
    String password;
     int marks[];


    // this is a copy constructor 
    Student(Student S1){
        marks = new int[3];
        this.name = S1.name;
        this.roll = S1.roll;
        // so when we are copying the s1 we are also copying the marks .
        this.marks = S1.marks;

        //note it only copy the positon of the array itself ans not the data inside the array;



    }


    Student(){
        marks = new int[3];
        System.out.println("constructor is called...");

    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll= roll;
    }

}
