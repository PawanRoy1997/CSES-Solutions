package grayCode;

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
        assertEquals("0\n1", outputStream.toString());
    }

    @Test
    public void testCaseTwo(){
        provideInput("2");
        classUnderTest.run();
        assertEquals("00\n01\n11\n10", outputStream.toString());
    }

    @Test
    public void testCaseThree(){
        provideInput("3");
        classUnderTest.run();
        assertEquals("000\n001\n011\n010\n110\n111\n101\n100", outputStream.toString());
    }
}