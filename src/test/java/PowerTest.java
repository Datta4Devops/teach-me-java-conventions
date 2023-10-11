//package powerPackage;
import org.junit.jupiter.api.Test;

import powerPackage.PowerFinder;

import static org.junit.jupiter.api.Assertions.*;

public class PowerTest {
    private int base;
    private int exponent;
    private int power;
    @Test
    public void checkIfOneRaisedToOneIsEqualsTOOne() {
        base = 1;
        exponent = 1;
        power = 1;
        assertEquals(PowerFinder.powerOf(base, exponent), power);
    }

    @Test
    public void checkIfTwoRaisedToOneIsEqualsToTwo() {
        base = 2;
        exponent = 1;
        power = 2;
        assertEquals(PowerFinder.powerOf(base, exponent), power);
    }

    @Test
    public void checkIfTwoPowerTwoIsEqualsToFour(){
        base = 2;
        exponent = 2;
        power = 4;
        assertEquals(PowerFinder.powerOf(base, exponent), power);
    }

    @Test
    public void checkIfThreeRaisedToTwoIsEqualsToNine(){
        base = 3;
        exponent = 2;
        power = 9;
        assertEquals(PowerFinder.powerOf(base, exponent), power);
    }

}
