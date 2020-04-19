public class UnitTests {

    public static void main(String[] args) {

        multiplyTwoNumbersTest();
        divideTwoNumbersTest();
        calculateTest();


    }
    public static void multiplyTwoNumbersTest() {

        MiniCalculator positiveNumber = new MiniCalculator(3);
        positiveNumber.multiply(5);
        if(positiveNumber.calculate() != 15) {
            System.out.print("Failed to multiply: Output " + positiveNumber.total);
        }
        else {
            System.out.print("Successful multiplication: Output " + positiveNumber.total);
        }

        System.out.println();

        MiniCalculator zeroNumber = new MiniCalculator(3);
        zeroNumber.multiply(0);
        if(zeroNumber.calculate() != 0) {
            System.out.print("Failed to multiply by zero: Output " + zeroNumber.total);
        }
        else {
            System.out.print("Successful multiplication by zero: Output " + zeroNumber.total);
        }

        System.out.println();

        MiniCalculator negativeNumber = new MiniCalculator(3);
        negativeNumber.multiply(-3);
        if(negativeNumber.calculate() != -9) {
            System.out.print("Failed to multiply by negative: Output " + negativeNumber.total);
        }
        else {
            System.out.print("Successful multiplication by negative: Output " + negativeNumber.total);
        }

        System.out.println();



    }

    public static void divideTwoNumbersTest() {

        MiniCalculator positiveNumber = new MiniCalculator(15);
        positiveNumber.divide(5);
        if(positiveNumber.calculate() != 3) {
            System.out.print("Failed to divide: Output " + positiveNumber.total);
        }
        else {
            System.out.print("Successful division: Output " + positiveNumber.total);
        }

        System.out.println();

        MiniCalculator zeroNumber = new MiniCalculator(0);
        zeroNumber.divide(3);
        if(zeroNumber.calculate() != 0) {
            System.out.print("Failed to divide by zero: Output " + zeroNumber.total);
        }
        else {
            System.out.print("Successful division by zero: Output " + zeroNumber.total);
        }

        System.out.println();

        MiniCalculator negativeNumber = new MiniCalculator(3);
        negativeNumber.divide(-3);
        if(negativeNumber.calculate() != -1) {
            System.out.print("Failed to divide: Output " + negativeNumber.total);
        }
        else {
            System.out.print("Successful division by negative: Output " + negativeNumber.total);
        }
        System.out.println();





    }

    public static void calculateTest(){

        MiniCalculator calculateNumber = new MiniCalculator(15);
        if(calculateNumber.calculate() != 15) {
            System.out.print("Failed calculate " + calculateNumber.total);
        }
        else {
            System.out.print("Successful calculate " + calculateNumber.total);
        }

    }




}

