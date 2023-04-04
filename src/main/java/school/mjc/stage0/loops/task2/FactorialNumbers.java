package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int x = 0;
        int factorial = 1;
        while (x <= printToInclusive) {
            if (x != 0) {
                factorial = factorial * x;
            }
            System.out.println(factorial);
            x++;
        }
     }
}
