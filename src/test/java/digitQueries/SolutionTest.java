package digitQueries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.BaseTestClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest extends BaseTestClass<Solution> {
    @Override
    @BeforeEach
    public void setup() {
        classUnderTest = new Solution();
    }

    @Test
    public void testCaseOne() {
        provideInput("1\n1");
        classUnderTest.run();
        assertEquals("1\n", outputStream.toString());
    }

    @Test
    public void testCaseTwo() {
        provideInput("2\n1\n10\n");
        classUnderTest.run();
        assertEquals("1\n1\n", outputStream.toString());
    }

    @Test
    public void testCaseThree() {
        provideInput("2\n1\n11\n");
        classUnderTest.run();
        assertEquals("1\n0\n", outputStream.toString());
    }

    @Test
    public void testCaseFour() {
        provideInput("1\n100");
        classUnderTest.run();
        assertEquals("5\n", outputStream.toString());
    }

    @Test
    public void testCaseFive() {
        provideInput("4\n582\n214\n723\n273");
        classUnderTest.run();
        assertEquals("0\n1\n7\n7\n", outputStream.toString());
    }

    @Test
    public void testCaseSix() {
        provideInput("1\n15888888888888840");
        classUnderTest.run();
        assertEquals("9\n", outputStream.toString());
    }
}