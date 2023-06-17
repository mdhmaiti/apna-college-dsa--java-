package oops;

public class chessInterface {
    public static void main(String[] args) {
        // creating an object of queen
        Queen q = new Queen();
        q.moves();// here it is implementing the abstaction.

        
    }
    
}
// now declaring the blueprint of the class i.e interface.
interface ChessPlayer {
    // defining the work i.e, the blue print
    void moves();// it is by default public and by default abstract.
    // we cannot define the work in here as it will be done in the classes/sub classes
}
class Queen implements ChessPlayer { // the key here is the word implements 

    public void moves(){ // here it is necessary to write the word "public " ,, as 
    //in the interface moves is defined as the public type (by default);
    System.out.println("up,down,right,diagonal(in all directions)");


    }

}

class Rook implements ChessPlayer {
    public void moves () {
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer {
    public void moves(){
        System.out.println("up, down ,left right,diagonal ( 1 step)");
    }
}