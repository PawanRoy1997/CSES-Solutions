package chessboardAndQueens;

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
        provideInput("........\n........\n..*.....\n........\n........\n.....**.\n...*....\n........\n");
        classUnderTest.run();
        assertEquals("65", outputStream.toString());
    }
}