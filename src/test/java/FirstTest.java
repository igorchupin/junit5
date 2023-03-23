import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FirstTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all started");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each started");
    }
    @Disabled
    @Test
    public void testOne() {
        System.out.println("test one started");
    }
    @Disabled
    @Test
    public void testTwo() {
        System.out.println("test two started");
    }
    @Disabled
    @Test
    public void testThree() {
        System.out.println("test three started");
    }
@Disabled
    @ParameterizedTest
    @ValueSource(strings = {"11", "12", "113", "114"})
    public void testFour(int value) {
        System.out.println("test four started with value " + value);
    }

    @Disabled
    @ParameterizedTest
    @EnumSource(Directions.class)
    public void testFive(Directions value) {
        System.out.println("test five started with value " + value.name());
    }
@Disabled
    @ParameterizedTest
    @CsvSource({
            "alex, qa, 30, works",
            "john,  aqa, 35, works",
            "britney, manager, 37, sleeps"
    })
    public void testSix(String name, String profession, int age, String activity) {
        Worker worker = new Worker(name, profession, age, activity);
        System.out.println("test five started with value " + worker.toString());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "worker.csv", numLinesToSkip = 1)
    public void testSeven(String name, String profession, int age, String activity) {
        Worker worker = new Worker(name, profession, age, activity);
        System.out.println("test five started with value " + worker.toString());
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
