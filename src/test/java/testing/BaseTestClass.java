package testing;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BaseTestClass<T> {
    public ByteArrayOutputStream outputStream;
    public T classUnderTest;

    @BeforeEach
    public void setOutputStream(){
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    public void provideInput(String input){
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
}
