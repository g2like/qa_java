import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void getFamilyTest(){
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",animal.getFamily());
    }
}
