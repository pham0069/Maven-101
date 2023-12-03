/**
 * Surefire will run classes whose name is suffixed by 'Test' or 'Testcase'
 * and finds those methods starting with 'test'
 * In this module, Surefire runs testHello() in the test phase
 */
public class JavaHelloWorldTest {
    public void testHello() {
        JavaHelloWorld a = new JavaHelloWorld();
        assert ("Hello World".equals(a.getHello()));
    }
}
