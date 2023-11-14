import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 0)
    public void testPrio3() {

        System.out.println("I am prio test 3.");
    }

    @Test(priority = -1)
    public void testPrio2() {
        System.out.println("I am prio test 2.");
    }

    @Test(priority = 1)
    public void testPrio1() {

        System.out.println("I am prio test 1.");
    }
}
