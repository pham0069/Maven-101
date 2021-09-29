import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldTest {
    @Test
    public void helloTest() {
        JavaHelloWorld a = new JavaHelloWorld();
        assertEquals("Hello World", a.getHello());
    }
}
