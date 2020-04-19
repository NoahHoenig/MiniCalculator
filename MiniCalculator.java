public class MiniCalculator extends Calculator {

    MiniCalculator() {
        super();
    }

    MiniCalculator(int x) {
        super(x);
    }

    @Override
    int calculate() {
        return total;
    }


}
