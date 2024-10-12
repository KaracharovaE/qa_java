import com.example.Feline;
import com.example.Lion;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class HasManeTest {

    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameter(1)
    public boolean expectedHasMane;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
        {"Самец", true},
        {"Самка", false}
        };
    }

    @Test
    public void testDoesHasMane() throws Exception {
        Feline feline = mock(Feline.class);
        Lion lion = new Lion(sex, feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }
}