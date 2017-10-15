package pl.lodz.uni.math.javaBeginning.myThirdCalculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private int result;

    public Calculator(int firstNumber, int secondNumber) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Calculator(){

    }

    public void add(){
        this.result=this.firstNumber+this.secondNumber;
    }

    public void setFirstNumber(int firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Object getResult() {
        return result;
    }
}
