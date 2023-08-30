package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    private int argumentOne;
    private int argumentTwo;

    // constructor
    public Divide (int argumentOne,int argumentTwo){
        this.argumentOne=argumentOne;
        this.argumentTwo=argumentTwo;

    }
    // optimise dislay by converting number into String
    public String toString(){
        return ("Division : "+String.valueOf(argumentOne/argumentTwo)+" Rest : "+String.valueOf(argumentOne%argumentTwo));
    }
}
