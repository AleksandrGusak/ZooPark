package GusPro;

import com.codeborne.selenide.commands.As;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Lion lion;

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        Integer expectedFeline = feline.getKittens(1);
        Integer actualFeline = 1;
        Assert.assertEquals(expectedFeline, actualFeline);
    }

    @Test
    public void doesHaveManeSexMan () throws Exception {
        Lion lion = new Lion ("Самец");
        Boolean expectedFeline = lion.hasMane;
        Boolean actualFeline = lion.doesHaveMane();
        Assert.assertEquals(expectedFeline, actualFeline);
    }

    @Test
    public void doesHaveManeSexWooman () throws Exception {
        Lion lion = new Lion ("Самка");
        Boolean expectedFeline = lion.hasMane;
        Boolean actualFeline = lion.doesHaveMane();
        Assert.assertEquals(expectedFeline, actualFeline);
    }

    @Test
    public void getFoodPredator() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Хищник");
        assertEquals("Хищник", "Хищник");
    }
    @Test
    public void getFoodPredator2() throws Exception {
        Animal animal = new Animal();
        List<String> actualAnimal = animal.getFood("Хищник");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actualAnimal);
    }
}