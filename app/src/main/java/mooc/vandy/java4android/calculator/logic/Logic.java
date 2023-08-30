package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        if (operation == ADDITION) {
            Add aj = new Add(argumentOne, argumentTwo);
            mOut.print(aj.toString());
        } else if (operation == SUBTRACTION) {
            Subtract sub = new Subtract(argumentOne, argumentTwo);
            mOut.print(sub.toString());
        } else if (operation == MULTIPLICATION) {
            Multiply mul = new Multiply(argumentOne, argumentTwo);
            mOut.print(mul.toString());
        } else if (operation == DIVISION) {
            try {
                Divide div = new Divide(argumentOne, argumentTwo);
                mOut.print(div.toString());
            } catch (ArithmeticException e) {
                mOut.print("Division by zero is not allowed");
            }
        }
    }
}
