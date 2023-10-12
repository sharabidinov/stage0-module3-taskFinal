package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        System.out.print(number % 10);
        System.out.print(number / 10 % 10);
        System.out.println(number/100);
    }
}
