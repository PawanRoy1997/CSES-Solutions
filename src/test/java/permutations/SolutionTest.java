package permutations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.BaseTestClass;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTestClass<Solution> {
    @Override
    @BeforeEach
    public void setup() {
        classUnderTest = new Solution();
    }

    @Test
    public void testCaseOne(){
        provideInput("1");
        classUnderTest.run();
        assertEquals("1", outputStream.toString());
    }
    @Test
    public void testCaseTwo(){
        provideInput("2");
        classUnderTest.run();
        assertEquals("NO SOLUTION", outputStream.toString());
    }
    @Test
    public void testCaseThree(){
        provideInput("3");
        classUnderTest.run();
        assertEquals("NO SOLUTION", outputStream.toString());
    }

    @Test
    public void testCaseFive(){
        provideInput("5");
        classUnderTest.run();
        assertEquals("1 3 5 2 4", outputStream.toString());
    }

    @Test
    public void testCaseFour(){
        provideInput("4");
        classUnderTest.run();
        assertEquals("3 1 4 2", outputStream.toString());
    }
}