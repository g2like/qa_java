import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParamTest {
    Feline feline = new Feline();
    public final int KITTENS_COUNT;

    public FelineParamTest(int kittensCount){
        this.KITTENS_COUNT = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] numberKittens(){
        return new Object[][]{{1},{2},{3},{4},{5},{6},{7},{8},{9}};
    }

    @Test
    public void getKittensTest(){
        Assert.assertEquals(KITTENS_COUNT,feline.getKittens(KITTENS_COUNT));
    }
}