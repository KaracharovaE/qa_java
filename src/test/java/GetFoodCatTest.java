import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GetFoodCat {

    Feline feline = mock(Feline.class);
    Cat cat = new Cat(feline);

    @Test
    public void testGetFoodReturnsMeat() throws Exception {
        List<String> expectedFood = Arrays.asList("Мясо");
        when(mockFeline.eatMeat()).thenReturn(expectedFood);

        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
    }

}
