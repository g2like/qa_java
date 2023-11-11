import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionParamTest{
    private Feline feline = new Feline();
    private final String sex;
    private final boolean hasMane;


    public LionParamTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] parameterLion(){
        return new Object[][]{{"Самец",true},{"Самка",false}};
    }


    @Test
    public void doesHaveManeTest() throws Exception{
        Lion lion = new Lion(sex,feline);
        Assert.assertEquals(hasMane,lion.doesHaveMane());
    }

}

