import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class HasManeLionThrowsExceptionLionTest {

    @Test(expected = Exception.class)
    public void testHasManeLionThrowsExceptionLion() throws Exception {
        Feline feline = mock(Feline.class);
        String invalidSex = "invalid";
        try {
            new Lion(invalidSex, feline);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
            throw e;
        }
    }
}