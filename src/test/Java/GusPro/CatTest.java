package GusPro;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock

    Predator predator;

    @Test
    public void getSoundCat() {
        Cat cat = new Cat(null);
       String expectedCatSound = cat.getSound();
        String actualCatSound = "Мяу";
       Assert.assertEquals(expectedCatSound, actualCatSound);

    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(predator);
       List <String> actualCatFood = predator.eatMeat();


    }
}