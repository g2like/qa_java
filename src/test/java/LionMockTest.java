import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Spy
    Feline feline;


    @Test
    public void getKittensTest() throws Exception{
        Lion lion = new Lion("Самка",feline);
        Assert.assertEquals(1,lion.getKittens());

    }

    @Test
    public void getFoodTest() throws Exception{
        Lion lion = new Lion("Самка",feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

}
