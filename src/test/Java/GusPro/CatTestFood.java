package GusPro;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class CatTestFood {

    @Mock

    Predator predator;

    @Test
    public void getFoodEatMeet() throws Exception {
        Cat cat = new Cat(predator);
        List<String> actualCatFood = predator.eatMeat();
        List<String> expectedCatFood = List.of();
        Assert.assertEquals(actualCatFood, expectedCatFood);
    }
}