import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    Feline feline;
    String sex = "Самец";



    @Test
    public void getKittensTest() throws Exception{
        Lion lion = new Lion(sex,feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1,lion.getKittens());

    }

    @Test
    public void getFoodTest() throws Exception{
        Lion lion = new Lion(sex,feline);
        Mockito.when(feline.getFood(Mockito.any())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

    @Test(expected = Exception.class)
    public void doesHaveManeTest() throws Exception{
        Lion lion = new Lion("Нечто", feline);
    }

}
