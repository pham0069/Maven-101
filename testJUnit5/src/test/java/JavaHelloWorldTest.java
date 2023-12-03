import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaHelloWorldTest {
    @Test
    public void helloTest() {
        JavaHelloWorld a = new JavaHelloWorld();
        assertEquals("Hello World", a.getHello());
    }
}
