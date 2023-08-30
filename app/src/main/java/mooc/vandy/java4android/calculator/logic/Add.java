package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
    private int argumentOne;
    private int argumentTwo;

    // constructor
    public Add (int argumentOne,int argumentTwo){
        this.argumentOne=argumentOne;
        this.argumentTwo=argumentTwo;

    }
   // optimise dislay by converting number into String
    public String toString(){
        return (String.valueOf("Sum : "+(argumentOne+argumentTwo)));
    }
}
