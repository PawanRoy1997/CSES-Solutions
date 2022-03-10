package numberSpiral;

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
    public void testCaseOne(){
        classUnderTest.solve(1,1);
        assertEquals("1\n", outputStream.toString());
    }
    @Test
    public void testCaseTwo(){
        classUnderTest.solve(1,2);
        assertEquals("2\n", outputStream.toString());
    }
    @Test
    public void testCaseThree(){
        classUnderTest.solve(2,2);
        assertEquals("3\n", outputStream.toString());
    }
    @Test
    public void testCaseFour(){
        classUnderTest.solve(2,1);
        assertEquals("4\n", outputStream.toString());
    }
    @Test
    public void testCaseFive(){
        classUnderTest.solve(3,1);
        assertEquals("5\n", outputStream.toString());
    }
    @Test
    public void testCaseSix(){
        classUnderTest.solve(3,2);
        assertEquals("6\n", outputStream.toString());
    }
    @Test
    public void testCaseSeven(){
        classUnderTest.solve(3,3);
        assertEquals("7\n", outputStream.toString());
    }
}