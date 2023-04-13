package homework2;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<Character, OptionCalculation> operationMap = new HashMap<>();
    Calculator() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    double makeCalculation(double operand1, double operand2, char operation) {
        OptionCalculation operationMapValue = operationMap.getOrDefault(operation,new NoOperationFound(operation));
        return operationMapValue.Calculation(operand1, operand2);
    }

}
