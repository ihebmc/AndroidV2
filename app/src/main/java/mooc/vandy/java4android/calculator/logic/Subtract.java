package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.
    private int argumentOne;
    private int argumentTwo;

    // constructor
    public Subtract(int argumentOne, int argumentTwo){
        this.argumentOne=argumentOne;
        this.argumentTwo=argumentTwo;

    }
    // optimise dislay by converting number into String
    public String toString(){
        return (String.valueOf("Sub : "+(argumentOne-argumentTwo)));
    }
}
