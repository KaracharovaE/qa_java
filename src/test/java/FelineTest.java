import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    private static final String EXPECTED_FAMILY = "Кошачьи";
    private static final List<String> EXPECTED_EAT_MEAT = List.of("Животные", "Птицы", "Рыба");
    private static final int DEFAULT_KITTENS_COUNT = 1;
    private static final int KITTENS_COUNT_3 = 3;
    private static final int KITTENS_COUNT_0 = 0;

    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        List<String> actualEat = feline.eatMeat();
        Assert.assertEquals(EXPECTED_EAT_MEAT, actualEat);
    }

    @Test
    public void testGetFamily() {
        String actualFamily = feline.getFamily();
        Assert.assertEquals(EXPECTED_FAMILY, actualFamily);
    }

    @Test
    public void testGetKittensDefault() {
        int actualKittens = feline.getKittens();
        Assert.assertEquals(DEFAULT_KITTENS_COUNT, actualKittens);
    }

    @Test
    public void testGetKittensWithCount_3() {
        int actualKittens = feline.getKittens(KITTENS_COUNT_3);
        Assert.assertEquals(KITTENS_COUNT_3, actualKittens);
    }

    @Test
    public void testGetKittensWithCount_0() {
        int actualKittens = feline.getKittens(KITTENS_COUNT_0);
        Assert.assertEquals(KITTENS_COUNT_0, actualKittens);
    }
}