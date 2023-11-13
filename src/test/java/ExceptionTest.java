import org.testng.annotations.*;

import java.io.IOException;

public class ExceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void testExceptions() {
        throw new RuntimeException("Pass");
    }

    @Test(expectedExceptions = {IOException.class, NullPointerException.class})
    public void testExceptions1() {
        throw new NullPointerException("Pass");
    }

    @Test(expectedExceptions = {IOException.class})
    public void testExceptions2() {
        throw new NullPointerException("Fail");
    }

    @Test
    public void testExceptions3() throws Exception {
        throw new IOException("Fail");
    }

    public static class BaseClassTest {
        @BeforeMethod
        public void beforeMethod() {
            System.out.println("Base Before Test method");
        }

        @AfterMethod
        public void afterMethod() {
            System.out.println("Base After Test method");
        }

        @BeforeClass
        public void beforeClass() {
            System.out.println("Base Before Class method");
        }

        @AfterClass
        public void afterClass() {
            System.out.println("Base After Class method");
        }

        @Test
        public void testName() {
            System.out.println("Test executed in Base Class");
        }
    }
}