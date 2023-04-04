package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        int x = 0;
        if (power < 0) {
            System.out.println("too much power");
        }
        while (x <= power) {
            int result = (int)Math.pow(2, x);
            System.out.println(result);
            x++;
        }
    }

    public static void main(String[] args) {
        printPower(4);
    }
}
