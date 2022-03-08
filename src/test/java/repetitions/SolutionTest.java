package repetitions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.BaseTestClass;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTestClass<Solution> {
    @BeforeEach
    public void setInstance(){
        classUnderTest = new Solution();
    }

    @Test
    public void testCaseOne(){
        provideInput("A");
        classUnderTest.run();
        assertEquals("1", outputStream.toString());
    }

    @Test
    public void testCaseTwo(){
        provideInput("ATTCGGGA");
        classUnderTest.run();
        assertEquals("3", outputStream.toString());
    }
}