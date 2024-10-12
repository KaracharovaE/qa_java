import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EatMeatFelineTest {

    @Test
    public void testEatMeat() throws Exception {

            Feline feline = new Feline();
            List<String> eat = feline.eatMeat();
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expected, eat);
    }
}