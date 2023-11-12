import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParamTest {
    Feline feline = new Feline();
    public final int kittensCount;

    public FelineParamTest(int kittensCount){
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] numberKittens(){
        return new Object[][]{{0},{1}};
    }

    @Test
    public void getKittensTest(){
        Assert.assertEquals(kittensCount,feline.getKittens(kittensCount));
    }
}