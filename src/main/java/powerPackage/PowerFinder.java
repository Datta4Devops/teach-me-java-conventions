package powerPackage;

public class PowerFinder {
    public static int powerOf(int base, int exponent) {
        int power = 1;
        for (int counter = 0; counter<exponent; counter++) {
            power *= base;
        }
        return power;
    }

}
