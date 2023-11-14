
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exercises {

    @DataProvider(name = "dataAddNumbers")
    public Object[][] dataAddNumbers() {
        return new Object[][]{
                {1, 2, 3},
                {2, 2, 4},
        };
    }

    @Test(dataProvider = "dataAddNumbers", groups = "addition")
    public void testSumNumbers(int a, int b, int expectedResult) {
        int actualResult = a + b;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "generateSubtractionData")
    public Object[][] generateSubtractionData() {
        return new Object[][]{
                {5, 3, 1},
                {4, 2, -1}
        };
    }

    @Test(dataProvider = "validateSubtractionData", groups = "subtraction")
    public void testSubtraction(int a, int b, int expectedResult) {
        int actualResult = a - b;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "validateMultiplicationData")
    public Object[][] validateMultiplicationData() {
        return new Object[][]{
                {2, 2, 4},
                {5, 6, 30},
                {4, 1, 5},
        };
    }

    @Test(dataProvider = "validateMultiplicationData", groups = "multiplication")
    public void testValidateMultiplication(int a, int b, int expectedResult) {
        int actualResult = a * b;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "validateDivisionData")
    public Object[][] validateDivisionData() {
        return new Object[][]{
                {9,3,3},
                {8,5,3},
        };
    }

    @Test(dataProvider = "validateDivisionData", groups = "division")
    public void testValidateDivision(int a, int b, int expectedResult) {
        try {
            int actualResult = a / b;
            Assert.assertEquals(actualResult, expectedResult);
        } catch (ArithmeticException e) {
            Assert.assertEquals(e.getMessage(), "/ by zero");
            if (b != 0) {
                throw e;
            }
        }
    }

    @DataProvider(name = "validateModulusData")
    public Object[][] validateModulusData() {
        return new Object[][] {
                {10, 5, 2}
        };
    }

    @Test(dataProvider = "generateModulusData", groups = "modules")
    public void testModulus(int a, int b, int expectedResult) {
        try {
            int actualResult = a % b;
            Assert.assertEquals(actualResult, expectedResult);
        } catch (ArithmeticException e) {
            Assert.assertEquals(e.getMessage(), "/ by zero");
            if (b != 0) {
                throw e;
            }
        }
    }
}