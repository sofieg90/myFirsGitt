package helloWorld;

public class Calculator {

    private int first;
    private int second;

    public Calculator(int firstNumber, int secondNumber) {
        first = firstNumber;
        second = secondNumber;
    }

    public int add() {
        return first + second;
    }
}
