import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;

public class GetSoundCatTest {

    @Test
    public void testGetSound() {
            Feline feline = mock(Feline.class);
            Cat cat = new Cat(feline);
            String expectedSound = "Мяу";
            String actualSound = cat.getSound();
            Assert.assertEquals(expectedSound, actualSound);
    }
}
