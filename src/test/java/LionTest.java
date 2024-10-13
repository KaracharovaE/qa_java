import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    Feline feline = mock(Feline.class);

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = Arrays.asList("Мясо", "Рыба", "Птица");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
   }

    @Test
    public void testGetKittens() throws Exception {
        when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        int kittensCount = lion.getKittens();
        assertEquals(1, kittensCount);
    }

    @Test
    public void testHasManeLionThrowsExceptionLion() {
        String invalidSex = "invalid";
        try {
            new Lion(invalidSex, feline);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}
