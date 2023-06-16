                                /////CONSTRUCTOR/////// EG Pen()..previous example ..it can only be used during object formation
                                //it is used to create object or initilize object......eg Pen p1= new Pen();//new land construct a space.
                                //memory allocation happens when a constructor is called
                                ///we cannot use p1.Pen();



public class oops2 {
    public static void main(String[] args) {
        Student s1 = new Student("medhashis");
        System.out.println(s1.name);// note : name jodi private hoto taole s1.name a error dakhato tokhn getname use korte hoto;
        


        Student2 s2 = new Student2();// allocating the memory ;;;;calling the constructor 
        
    }
    
}
//constructor has a by default value in java if we dont create a construtor the java will automatically create a contructor
//or we can initialize a constructor and pass some value inside it ..the examples are given below 
//             "" note : by default java tokhn ii akta constructor banai jokhn amra aga kono constructor likhini ""
class Student{
    String name;
    int roll;
    //create a constructor of student who have a name 
    Student(String name){// note :it has the same name as the class;; and if we dont not create Student there is no prlm it will run as java will create it by default
        this.name = name;//here name is internal and this.name is present name
    }
}
//constructor when we do want to pass the variable
class Student2 {
    String name2;
    Student2(){
        System.out.println("constructor is called........");
    }
    
    
}


// there are three types of constructor 1> parameterized 2> non parameterized and 3> copy constructor