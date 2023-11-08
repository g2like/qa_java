import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class FelineTest {

    private Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception{
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }

    @Test
    public void getFamily(){
        Assert.assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void getKittensTest(){
        Assert.assertEquals(1,feline.getKittens());
    }

}
