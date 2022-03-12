package trailingZeros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.BaseTestClass;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTestClass<Solution> {

    @BeforeEach
    @Override
    public void setup() {
        classUnderTest = new Solution();
    }

    @Test
    public void testCaseOne(){
        provideInput("395");
        classUnderTest.run();
        assertEquals("97", outputStream.toString());
    }

    @Test
    public void testCaseTwo(){
        provideInput("871");
        classUnderTest.run();
        assertEquals("215", outputStream.toString());
    }

    @Test
    public void testCaseThree(){
        provideInput("239");
        classUnderTest.run();
        assertEquals("57", outputStream.toString());
    }

    @Test
    public void testCaseFour(){
        provideInput("535");
        classUnderTest.run();
        assertEquals("132", outputStream.toString());
    }
}