package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first, second, third, fourth;
        first = number % 10;
        second = number / 10 % 10;
        third = number / 100 % 10;
        fourth = number / 1000 % 10;
        System.out.println(first + second + third + fourth);
    }
}
