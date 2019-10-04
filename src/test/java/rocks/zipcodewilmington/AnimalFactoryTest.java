package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        Date date = new Date();
        Dog dog = AnimalFactory.createDog("Nine", new Date());
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        Assert.assertEquals("Nine", actualName);
        Assert.assertEquals(date, actualDate);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        Date date = new Date();
        Dog cat = AnimalFactory.createDog("Nine", new Date());
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();
        Assert.assertEquals("Nine", actualName);
        Assert.assertEquals(date, actualDate);
    }
}
