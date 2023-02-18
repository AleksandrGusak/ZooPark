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


    @Test
    public void getKittens() {

    }

    @Test
    public void doesHaveManeSexMan() throws Exception {
        Lion lion = new Lion("Самец");
        Boolean expectedFeline = lion.hasMane;
        Boolean actualFeline = lion.doesHaveMane();
        Assert.assertEquals(expectedFeline, actualFeline);
    }

    @Test
    public void doesHaveManeSexWooman() throws Exception {
        Lion lion = new Lion("Самка");
        Boolean expectedFeline = lion.hasMane;
        Boolean actualFeline = lion.doesHaveMane();
        Assert.assertEquals(expectedFeline, actualFeline);
    }

    @Test
    public void getFoodLion() throws Exception {
     Lion lion = new Lion("Самец");
     List <String> lionFood = lion.getFood();
     Assert.assertEquals(List.of("Животные","Птицы","Рыба"), lionFood);

    }
}