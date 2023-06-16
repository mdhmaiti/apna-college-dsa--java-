
                                                        ////ENCAPSULATION ///////




public class oops {// by default class capital letter aa start kotbo
    //and function small letter 
    //so that people can understand that you are a exped developer
    //class contains different objects.
    public static void main(String args[]){
        Pen p1= new Pen();//memory r moddhe ghas kete vite khurlo;
        p1.setColor("blue");//p1= vithe;vither moddhe dhuke setColor ar jaigai giye akta color choose korlo
        System.out.println(p1.color);//print koralam
        p1.setTip(5);
        //note : p1 is an object
        System.out.println(p1.tip);
        //set color yellow
        p1.color="yellow";
        System.out.println(p1.color);
        
        BankAccount myAcc= new BankAccount();
        myAcc.username="medhashis";
        myAcc.setPassword("abedefghi");

        //constructor ; created a pen object p1
        //new keyword creates a space in heap
    
        Pen2 p2 =new Pen2();
        p2.setColor("blue");
        System.out.println(p2.getColor());
        p2.setTip(5);
        System.out.println(p2.getTip());
        p2.setColor("yellow");
        System.out.println(p2.getColor());
    
    
    
    
    }   


}
class BankAccount{
    // how to use private default protected and public
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
//eg
class Pen{
    //properties of pen
    String color;
    int tip;
    //function of pen ki kaj kora
    void setColor(String newcolor){
        color=newcolor;//akta extra variable nicchi print koranor jonno
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Pen2{
    //properties of pen
   private String color;
   private int tip;
    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    //function of pen ki kaj kora
    void setColor(String newcolor){
        this.color=newcolor;//akta extra variable nicchi print koranor jonno
    }
    void setTip(int tip){
        this.tip= tip;//tip is external variable and this.tip is for the internal variable
    }   // object ar reference ar jonno use hoy this
}
class Student{
    String name;
    int age;
    float percentage;
    void calPercentage(int phy,int chy,int math){
        percentage=(phy+chy+math)/3;
    }

}