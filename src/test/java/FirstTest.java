import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all started");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each started");
    }

    @Test
    public void testOne() {
        System.out.println("test one started");
    }

    @Test
    public void testTwo() {
        System.out.println("test two started");
    }

    @Test
    public void testThree() {
        System.out.println("test three started");
    }

    @Test
    public void testFour() {
        System.out.println("test four started");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each started");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all started");
    }

}
