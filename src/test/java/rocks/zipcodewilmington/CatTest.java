package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setName(){
        Cat cat = new Cat(null, new Date(), null);
        String expected = "Darf";
        cat.setName("Darf");
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Cat cat = new Cat(null, null, null);
        Date dateExpected = new Date();
        cat.setBirthDate(dateExpected);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(dateExpected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Cat cat = new Cat(null, null, null);
        int numOfMealsEaten = cat.getNumberOfMealsEaten();
        cat.eat(new Food());
        int actual = cat.getNumberOfMealsEaten();
        int expected = numOfMealsEaten + 1;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Cat cat = new Cat(null, null, 2);
        int expected = 2;
        int actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        Cat cat = new Cat(null, null, null);
        boolean actual = cat instanceof Animal;
        Assert.assertTrue(actual);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        Cat cat = new Cat(null, null,null);
        boolean actual = cat instanceof Mammal;
        Assert.assertTrue(actual);

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
