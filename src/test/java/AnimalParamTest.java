import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {
    private final String animalKind;
    private final List<String> animalList;

    public AnimalParamTest(String animalKind, List<String> animalList){
        this.animalKind = animalKind;
        this.animalList = animalList;
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
        Assert.assertEquals(animalList, animal.getFood(animalKind));
    }
}
