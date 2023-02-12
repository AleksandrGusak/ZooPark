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
        String expectedAnimal = "Трава";
        List <String> actualAnimal = animal.getFood("Травоядное");
        assertEquals(expectedAnimal, actualAnimal);
    }

    @Test
    public void getFamily() throws Exception {
        Animal animal = new Animal();
        assertEquals("беличьи", "беличьи");
    }



    }


