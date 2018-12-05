package Math;

import org.junit.Assert;
import org.junit.Test;

public class MathAddTest {

    @Test
    public void testAddInPositive(){
        //is
        int numOne = 1,numTwo=2;

        //then
        final int result = MyMath.Add(numOne,numTwo);

        //exepted
        Assert.assertEquals(3,result);



    }


}
