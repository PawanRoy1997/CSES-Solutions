package twoKnights;

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
        assertEquals("0\n", outputStream.toString());
    }
    @Test
    public void testCaseTwo(){
        provideInput("2");
        classUnderTest.run();
        assertEquals("0\n6\n", outputStream.toString());
    }
    @Test
    public void testCaseThree(){
        provideInput("8");
        classUnderTest.run();
        assertEquals("0\n6\n28\n96\n252\n550\n1056\n1848\n", outputStream.toString());
    }
}