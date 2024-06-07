public class Calculator implements ICalculator {
    private double num1 = 0.0;
    private double num2 = 0.0;
    
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    @Override
    public double GetSum() {
        return (double) (((num1 + num2) * 100) / 100);
    }
    
    @Override
    public double GetDifference() {
        return (double) (((num1 - num2) * 100) / 100);
    }
    
    @Override
    public double GetProduct() {
        return (double) (((num1 * num2) * 100) / 100);
    }
    
    @Override
    public double GetQuotient() {
        try {
            return (double) (((num1 / num2) * 100) / 100);
        } catch (ArithmeticException e) {
            System.err.println("");
            return 0.0;
        }
    }
}