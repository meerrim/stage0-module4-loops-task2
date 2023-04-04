package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {
        int x = 0;
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        while (x <= Math.abs(multiplyByAndToInclusive)) {
            System.out.println(x * multiplyByAndToInclusive);
            x++;
        }
    }

    public static void main(String[] args) {
        printMultiplied(0);
    }
}
