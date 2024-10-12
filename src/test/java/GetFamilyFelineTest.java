import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class GetFamilyFelineTest {

    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }
}
