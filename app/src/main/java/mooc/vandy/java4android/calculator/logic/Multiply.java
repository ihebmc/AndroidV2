package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.
    private int argumentOne;
    private int argumentTwo;

    // constructor
    public Multiply (int argumentOne,int argumentTwo){
        this.argumentOne=argumentOne;
        this.argumentTwo=argumentTwo;

    }
    // optimise dislay by converting number into String
    public String toString(){
        return (String.valueOf("Multiply : "+(argumentOne*argumentTwo)));
    }
}
