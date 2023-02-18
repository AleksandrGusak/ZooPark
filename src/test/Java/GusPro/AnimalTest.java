package GusPro;

import com.google.gson.annotations.JsonAdapter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Хищник");
        assertEquals("Хищник", "Хищник");
    }

    @Test
    public void getFood2() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Травоядное");
        assertEquals("Травоядное", "Травоядное");
    }

    @Test
    public void getFood3() throws Exception {
        Animal animal = new Animal();
        List <String> actualAnimal = animal.getFood("Травоядное");
        Assert.assertEquals(List.of("Трава", "Различные растения"), actualAnimal);
    }

    @Test
    public void getFood4() throws Exception {
        Animal animal = new Animal();
        List <String> actualAnimal = animal.getFood("Хищник");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actualAnimal);
    }

    @Test
    public void getFamily() throws Exception {
        Animal animal = new Animal();
        String expectedGetFamily =  animal.getFamily();
        String actualGetFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expectedGetFamily, actualGetFamily);
    }



    }


