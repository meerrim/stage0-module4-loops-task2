package school.mjc.stage0.loops.task2;

import java.math.BigInteger;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int x = 2;
        while (x <= printToInclusive) {
            BigInteger bigInteger = BigInteger.valueOf(x);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(x));
            if (probablePrime) {
                System.out.println(x);
            }
            x++;
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(29);
    }
}
