package homework2;

import java.util.InputMismatchException;

public class NoOperationFound implements OptionCalculation {
    private char mathSign;
    NoOperationFound(char mathSign) {
        this.mathSign = mathSign;
    }
    @Override
    public double Calculation(double leftDigit, double rightDigit) {
        throw new InputMismatchException("Operation " + mathSign + " not found");
    }
}
