package GusPro;

import com.codeborne.selenide.commands.As;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)

public class PredatorTest {

    @Mock

    Predator predator;

    @Test
    public void eatMeatPredator() throws Exception {
        Mockito.when(predator.eatMeat()).thenReturn(null);
        Feline feline = new Feline();
        List <String> expectedAnimal = null;
        List <String> actualAnimal = predator.eatMeat();
        assertEquals(expectedAnimal, actualAnimal);
    }



}