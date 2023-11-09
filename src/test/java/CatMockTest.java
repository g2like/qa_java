import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {

    @Spy
    Feline feline = new Feline();

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу",cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception{
        Cat cat = new Cat(feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());
    }
}
