package GusPro;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.codeborne.selenide.impl.Cleanup.of;
import static java.util.List.of;
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


    }