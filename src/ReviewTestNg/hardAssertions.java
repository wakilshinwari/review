package ReviewTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertions {
    @Test
    public void hardAssert(){
        String actualName= "mark";
        String expectedName="mark";

        Assert.assertEquals(actualName, expectedName);
        System.out.println("I am on second assertion");
        boolean test = true ;
        Assert.assertTrue(test);

    }
}
