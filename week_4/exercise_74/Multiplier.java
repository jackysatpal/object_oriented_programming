public class Multiplier {
    
    private int firstNumber;
    
    public Multiplier(int number) {
        this.firstNumber = number;
    }
    
    public int multiply(int secondNumber) {
        return this.firstNumber * secondNumber;
    }
}