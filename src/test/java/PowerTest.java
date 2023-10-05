//package powerPackage;
import org.junit.jupiter.api.Test;

import powerPackage.PowerFinder;

public class PowerTest {
    @Test
    public void checkIfOneRaisedToOneIsOne() {
        assert PowerFinder.powerOf(1,1) == 1;
    }

    @Test
    public void checkIfTwoRaisedToOneIsTwo() {
        assert PowerFinder.powerOf(2,1) == 2;
    }

    @Test
    public void checkIfTwoPowerTwoIsFour(){
        assert PowerFinder.powerOf(2,2) == 4;
    }

    @Test
    public void checkIfThreeRaisedToTwoIsNine(){
        assert PowerFinder.powerOf(3,2) == 9;
    }

}
