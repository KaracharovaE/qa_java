import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetFoodThrowsExceptionCatTest {

    @Test(expected = Exception.class)
    public void testGetFoodThrowsException() throws Exception {
        Feline feline = mock(Feline.class);
        Cat cat = new Cat(feline);
        when(feline.eatMeat()).thenThrow(new Exception("Error retrieving food"));
        cat.getFood();
    }
}
