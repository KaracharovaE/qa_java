import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetKittensLionTest {

    @Test
    public void testGetKittens() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        int kittensCount = lion.getKittens();
        assertEquals(1, kittensCount);
    }
}