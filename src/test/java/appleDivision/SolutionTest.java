package appleDivision;

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
        provideInput("10\n603 324 573 493 659 521 654 70 718 257\n");
        classUnderTest.run();
        assertEquals("2", outputStream.toString());
    }

    @Test
    public void testCaseTwo(){
        provideInput("20\n13048212 423374770 19874608 812293014 860896267 224937483 907570920 952166494 450127366 887381168 966393898 102318919 723213664 491414754 571209206 99007249 302987622 263275846 36174214 727737543\n");
        classUnderTest.run();
        assertEquals("8231", outputStream.toString());
    }

    @Test
    public void testCaseThree(){
        provideInput("1\n1000000000");
        classUnderTest.run();
        assertEquals("1000000000", outputStream.toString());
    }

    @Test
    public void testCaseFour(){
        provideInput("2\n1 1");
        classUnderTest.run();
        assertEquals("0", outputStream.toString());
    }
}