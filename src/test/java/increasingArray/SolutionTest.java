package increasingArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.BaseTestClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest extends BaseTestClass<Solution> {
    @BeforeEach
    public void setInstance(){
        classUnderTest = new Solution();
    }

    @Test
    public void testCaseOne(){
        provideInput("2 2 1");
        classUnderTest.run();
        assertEquals("1", outputStream.toString());
    }
    @Test
    public void testCaseTwo(){
        provideInput("2 2 3");
        classUnderTest.run();
        assertEquals("0", outputStream.toString());
    }

    @Test
    public void testCaseThree(){
        provideInput("10 6 10 4 10 2 8 9 2 7 7");
        classUnderTest.run();
        assertEquals("31", outputStream.toString());
    }
}