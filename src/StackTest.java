import org.junit.Before;
import org.junit.Test;


public class StackTest {
    private static Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPush() throws Exception {
        for(int i = 0; i <= 5; ++i)
        {
            stack.push(i);
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPop() throws Exception {
        stack.pop();
    }
}
