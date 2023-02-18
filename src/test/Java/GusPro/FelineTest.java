package GusPro;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    @Mock

    Predator predator;

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List <String> actualAnimal = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actualAnimal);

    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String expectedGetFamily = feline.getFamily();
        String actualGetFamily = "Кошачьи";
        Assert.assertEquals(expectedGetFamily, actualGetFamily);

    }


    @Test
    public void getKittens() {

    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        feline.getKittens(1);
        assertEquals(1, 1);
    }
}