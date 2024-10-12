import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class GetKittensFelineTest {

    @Test
    public void testGetKittensDefault() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithCount() {
        Feline feline = new Feline();
        Assert.assertEquals(3, feline.getKittens(3));
        Assert.assertEquals(0, feline.getKittens(0));
    }
}

