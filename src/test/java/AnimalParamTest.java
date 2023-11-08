import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {
    private final String ANIMAL_KIND;
    private final List<String> ANIMAL_LIST;

    public AnimalParamTest(String animalKind, List<String> animalList){
        this.ANIMAL_KIND = animalKind;
        this.ANIMAL_LIST = animalList;
    }

    @Parameterized.Parameters
    public static Object[][] numberKittens() {
        return new Object[][]{{"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(ANIMAL_LIST, animal.getFood(ANIMAL_KIND));
    }
}
