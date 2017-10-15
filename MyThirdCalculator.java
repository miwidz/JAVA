package pl.lodz.uni.math.javaBeginning.myThirdCalculator;

public class MyThirdCalculator {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator(6,7);

        myCalculator.add();
        myCalculator.setFirstNumber(10);
        myCalculator.setSecondNumber(12);
        myCalculator.getResult();

        Calculator myCalculatorOne = new Calculator(6,7);
        Calculator myCalculatorTwo = new Calculator(6,7);
    }

}
