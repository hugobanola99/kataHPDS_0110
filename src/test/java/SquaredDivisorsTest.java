import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SquaredDivisorsTest {

    private SquaredDivisors perfectSquared;

    @Before
    public void setup(){
        perfectSquared = new SquaredDivisors();
    }

    @Test
    public void DivisorSumTest(){

        assertEquals(perfectSquared.DivisorSum(246),84100);
        assertEquals(perfectSquared.DivisorSum(42),2500);
        assertEquals(perfectSquared.DivisorSum(1),1);

    }

    @Test
    public void PerfectSquareTest(){

        assertEquals(perfectSquared.isPerfectSquare(84100),true);
        assertEquals(perfectSquared.isPerfectSquare(2500),true);
        assertEquals(perfectSquared.isPerfectSquare(1),true);
    }

    @Test
    public void testCaso1(){

        int[] test = perfectSquared.searchSquaredDivisor(1,250);
        assertEquals(1,test[0]);
        assertEquals(42,test[1]);
        assertEquals(246,test[2]);
    }

    @Test
    public void testCaso2(){

        int[] test = perfectSquared.searchSquaredDivisor(42,250);
        assertEquals(246,test[1]);
        assertEquals(42,test[0]);

    }

}
