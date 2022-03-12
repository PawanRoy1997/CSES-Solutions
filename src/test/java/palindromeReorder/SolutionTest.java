package palindromeReorder;

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
        provideInput("A");
        classUnderTest.run();
        assertEquals("A", outputStream.toString());
    }

    @Test
    public void testCaseTwo(){
        provideInput("AA");
        classUnderTest.run();
        assertEquals("AA", outputStream.toString());
    }

    @Test
    public void testCaseThree(){
        provideInput("ABZA");
        classUnderTest.run();
        assertEquals("NO SOLUTION", outputStream.toString());
    }
}