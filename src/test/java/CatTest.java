import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatTest {

    Feline feline = mock(Feline.class);
    Cat cat = new Cat(feline);

    @Test
    public void testGetFoodReturnsMeat() throws Exception {
        List<String> expectedFood = List.of("Мясо");
        when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetSound() {
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }

    @Test
    public void testGetFoodThrowsException() throws Exception {
        when(feline.eatMeat()).thenThrow(new Exception("Error retrieving food"));
        try {
            cat.getFood();
            Assert.fail("Expected Exception was not thrown");
        } catch (Exception e) {
            assertEquals("Error retrieving food", e.getMessage());
        }
    }
}
