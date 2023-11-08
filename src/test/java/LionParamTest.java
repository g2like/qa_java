import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionParamTest{
    private Feline feline = new Feline();
    private final String SEX;

    public LionParamTest(String sex){
        this.SEX = sex;
    }

    @Parameterized.Parameters
    public static Object[][] parameterLion(){
        return new Object[][]{{"Самец"},{"Самка"},{"Нечто"}};
    }

    @Test
    public void doesHaveManeTest(){
        try{
            Lion lion = new Lion(SEX,feline);
            if (lion.doesHaveMane()) {
                Assert.assertTrue(lion.doesHaveMane());
            }else{
                Assert.assertFalse(lion.doesHaveMane());
            }
        }catch (Exception exception){
            System.out.println("Error");
        }
    }
}
