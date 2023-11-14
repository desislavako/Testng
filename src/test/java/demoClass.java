import org.testng.annotations.*;


public class demoClass {

    @BeforeSuite(alwaysRun = true)
    public void testBeforeSuite() {
        System.out.println("I am executed BeforeSuite");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("I am executed BeforeTest");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("I am executed BeforeClass");
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("I am executed BeforeMethod");
    }

    @Test
    public void testName1() {
        System.out.println("I am test method 1.");
    }

    @Test
    public void testName2() {
        System.out.println("I am test method 2.");
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("I am executed AfterMethod");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("I am executed AfterClass");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("I am executed AfterTest");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("I am executed AfterSuite");
    }
}