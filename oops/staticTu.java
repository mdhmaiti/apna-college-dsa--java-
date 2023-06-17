package oops;

public class staticTu {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JMI";
        
        Student s2 = new Student();
        System.out.println(s2.schoolName);


        Student s3 = new Student();
        s3.schoolName = "panishawla";// it will change the latest school name in thenmemory.

        System.out.println(s3.schoolName);

        Student s4 = new Student();
        System.out.println(s4.schoolName);// it will print the latest chnages schoolname
        
        System.out.println(s2.schoolName);// it will change to panishawla


        // note here we did not define the schoolname of the newstudent 
        //but as the school name is static string -> it by default takes the school name of s1.
        // if it was not a static it should return a empty string.
       
    }

}
class Student {


    static int marksAvg(int phy,int che,int math) { // thhis is a static function
            return (phy+che+math)/3 ;
    }


    String name ;
    int roll ;

    static String schoolName ;

    // now we are defining the getters and setters
    void setName(String name){
        this.name = name ;
    }
    String getName(){
        return this.name;
    }
}