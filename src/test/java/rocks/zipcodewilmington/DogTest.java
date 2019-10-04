package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    public void setName(){
        Dog dog = new Dog(null, new Date(), null);
        String expected = "Doof";
        dog.setName("Doof");
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog(null, null, null);
        Date dateExpected = new Date();
        dog.setBirthDate(dateExpected);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(dateExpected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Dog dog = new Dog(null, null, null);
        int numOfMealsEaten = dog.getNumberOfMealsEaten();
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();
        int expected = numOfMealsEaten + 1;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Dog dog = new Dog(null, null, 2);
        int expected = 2;
        int actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog(null, null, null);
        boolean actual = dog instanceof Animal;
        Assert.assertTrue(actual);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        Dog dog = new Dog(null, null,null);
        boolean actual = dog instanceof Mammal;
        Assert.assertTrue(actual);

    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
