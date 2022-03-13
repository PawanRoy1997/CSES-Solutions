package creatingString;

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
    public void testCaseSimple(){
        provideInput("aaa");
        classUnderTest.run();
        assertEquals("1\naaa", outputStream.toString());
    }

    @Test
    public void testCaseDifficult(){
        provideInput("aaabc");
        classUnderTest.run();
        assertEquals("20\naaabc\naaacb\naabac\naabca\naacab\naacba\nabaac\nabaca\nabcaa\nacaab\nacaba\nacbaa\nbaaac\nbaaca\nbacaa\nbcaaa\ncaaab\ncaaba\ncabaa\ncbaaa", outputStream.toString());
    }
}