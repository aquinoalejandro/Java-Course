package src;

public class calculadora {
    private final double num1;
    private final double num2;
    private double num3;

    public calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public calculadora(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public double Sumar() {
        return this.num1 + this.num2;
    }

    public double SumarTres() {
        return this.num1 + this.num2 + this.num3;
    }
}
