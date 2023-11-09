import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.rmi.server.ExportException;


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
        return new Object[][]{{"Самец",true},{"Самка",false},{"Нечто",false}};
    }

    @Test
    public void doesHaveManeTest(){
       try{
           Lion lion = new Lion(sex,feline);
           Assert.assertEquals(hasMane,lion.doesHaveMane());
       }catch (Exception e){
           System.out.println("Используйте допустимые значения пола животного - самей или самка");
       }
    }
}
