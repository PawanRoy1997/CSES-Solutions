package bitStrings;

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
        provideInput("1");
        classUnderTest.run();
        assertEquals("2", outputStream.toString());
    }

    @Test
    public void testCaseTwo(){
        provideInput("2");
        classUnderTest.run();
        assertEquals("4", outputStream.toString());
    }

    @Test
    public void testCaseThree(){
        provideInput("3");
        classUnderTest.run();
        assertEquals("8", outputStream.toString());
    }

    @Test
    public void testCasetwentySeven(){
        provideInput("27");
        classUnderTest.run();
        assertEquals("134217728", outputStream.toString());
    }
}