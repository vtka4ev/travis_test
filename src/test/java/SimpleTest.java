import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vtkachev on 20.02.17.
 */
public class SimpleTest {

    @Test
    public void testToSucceed() {
        System.out.println("Test to succeed run");
        Assert.assertTrue(false);
    }
}
