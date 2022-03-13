package towerOfHanoi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.BaseTestClass;

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
        Assertions.assertEquals("1\n1 3", outputStream.toString());
    }

    @Test
    public void testCaseTwo() {
        provideInput("2");
        classUnderTest.run();
        Assertions.assertEquals("3\n1 2\n1 3\n2 3", outputStream.toString());
    }
}