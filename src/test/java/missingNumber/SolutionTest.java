package missingNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.BaseTestClass;

class SolutionTest extends BaseTestClass<Solution> {

    @Test
    public void testCaseOne(){
        provideInput("2\n2");
        classUnderTest.run();
        Assertions.assertEquals("1", outputStream.toString());
    }

    @Test
    public void testCaseTwo(){
        provideInput("3 1 2");
        classUnderTest.run();
        Assertions.assertEquals("3", outputStream.toString());
    }

    @Override
    @BeforeEach
    public void setup() {
        classUnderTest = new Solution();
    }
}