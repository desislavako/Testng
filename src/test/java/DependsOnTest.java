import org.testng.Assert;
import org.testng.annotations.*;

public class DependsOnTest {

    @Test(dependsOnGroups = "group.dependency" )
    public void testDependsOnGroup() {
        System.out.println("This method depends on group.dependency");
    }

    @Test(groups = "group.dependency")
    public void testGroupDependency() {
        System.out.println("This method is part of group.dependency");
    }

    @Test(groups = "group.dependency")
    public void testGroupDependency2() {
        System.out.println("This method is part of group.dependency");
    }

    public static class DataProviderTests {
        @DataProvider(name = "generateValues")
        public Object[][] generateValues() {
            return new Object[][]{{"First-Value"}, {"Second-Value"}};
        }

        @Test(dataProvider = "generateValues")
        public void testDataProvider(String val) {
            System.out.println("Passed Parameter Is : " + val);
        }

        @DataProvider(name = "generateNumbers")
        public Object[][] generateNumbers() {
            return new Object[][]{{2, 3, 5}, {5, 7, 9}};
        }

        @Test(dataProvider = "generateNumbers")
        public void testDataProviderMultipleParameters(int a, int b, int expectedSum) {
            int sum = a + b;
            Assert.assertEquals(expectedSum, sum);
        }

    }

    public static class ChildClassTests extends ExceptionTest.BaseClassTest {
        @BeforeMethod
        public void beforeMethodChild() {
            System.out.println("Child Before Test method");
        }

        @AfterMethod
        public void afterMethodChild() {
            System.out.println("Child After Test method");
        }

        @BeforeClass
        public void beforeClassChild() {
            System.out.println("Child Before Class method");
        }

        @AfterClass
        public void afterClassChild() {
            System.out.println("Child After Class method");
        }

        @Test
        public void testName() {
            System.out.println("Test executed in Child Class");
        }
    }
}
