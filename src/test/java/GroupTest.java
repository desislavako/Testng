import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = "smoke")
    public void testSmokeGroup1() {
    }

    @Test(groups = "smoke")
    public void testSmokeGroup2() {
    }

    @Test(groups = "regression")
    public void testRegressionGroup1() {
    }

    @Test(groups = "regression")
    public void testRegressionGroup2() {
    }
}
