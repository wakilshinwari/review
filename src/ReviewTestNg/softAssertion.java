package ReviewTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
    @Test
    public void softAssert() {
        SoftAssert soft = new SoftAssert();

        String actualName = "mark";
        String expectedName = "mar";
        soft.assertEquals(actualName, expectedName);

        System.out.println("I am on second assertion");
        boolean test = true;
        soft.assertTrue(test);
        soft.assertAll();
    }
}