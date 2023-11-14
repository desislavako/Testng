
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTests {
    @Test
    public void testHardAssertions() {
        Assert.assertTrue(3 > 2);
        Assert.assertEquals("Text", "Text1");
    }

  //  @Test
    public void testSoftAssertions() {

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(5 == 6);
        softAssert.assertFalse(6 < 5);

        softAssert.assertAll();
    }
}