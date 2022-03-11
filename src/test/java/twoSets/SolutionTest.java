package twoSets;

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
    public void testCaseOne() {
        provideInput("1");
        classUnderTest.run();
        assertEquals("NO", outputStream.toString());
    }

    @Test
    public void testCaseTwo() {
        provideInput("2");
        classUnderTest.run();
        assertEquals("NO", outputStream.toString());
    }

    @Test
    public void testCaseThree() {
        provideInput("5");
        classUnderTest.run();
        assertEquals("NO", outputStream.toString());
    }
}