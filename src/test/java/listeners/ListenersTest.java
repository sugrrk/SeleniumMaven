package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.CustomListeners.class)
public class ListenersTest {
    @Test
    void Test1() {
        System.out.println("This is test1......");
        Assert.assertEquals("A", "A");
    }


    @Test
    void Test2() {
        System.out.println("This is test2......");
        Assert.assertEquals("A", "a");
    }


    @Test
    void Test3() {
        System.out.println("This is test3......");
        throw new SkipException("This is skip exception");
    }

}
