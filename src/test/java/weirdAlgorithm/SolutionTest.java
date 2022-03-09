package weirdAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.BaseTestClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest extends BaseTestClass<Solution> {
    @Test
    public void testCaseOne() {
        super.provideInput("1");
        classUnderTest.run();
        assertEquals("1", outputStream.toString());
    }
    
    @Test
    public void testCaseTwo(){
        provideInput("2");
        classUnderTest.run();
        assertEquals("2 1", outputStream.toString());
    }

    @Test
    public void testCaseThree(){
        provideInput("3");
        classUnderTest.run();
        assertEquals("3 10 5 16 8 4 2 1", outputStream.toString());
    }

    @Override
    @BeforeEach
    public void setup() {
        classUnderTest = new Solution();
    }
}