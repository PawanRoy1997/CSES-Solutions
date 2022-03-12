package coinPiles;

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
        provideInput("3\n2 1\n2 2\n3 3");
        classUnderTest.run();
        assertEquals("YES\nNO\nYES\n", outputStream.toString());
    }
}