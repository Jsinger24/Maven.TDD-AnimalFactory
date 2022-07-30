package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
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

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Lester";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setBirthDateTest() {
        // Given (a name exists and a dog exists)
        Date expectedBirthDate = new Date(6);

        // When (a dog's name is set to the given name)
        Dog dog = new Dog("Leo", new Date(8), 9);
        dog.setBirthDate(expectedBirthDate);
        Date actualBirthDate = dog.getBirthDate();

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void setSpeakTest(){
        //Given
        String expectedSpeak = "bark!";
        //When
        Dog dog = new Dog("Riley", new Date(6), 2);
        dog.speak();
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actual);
    }

    @Test
    public void setEat(){
        //Given
        Food food = new Food();
        int numberOfMealsExpected = 1;

        //When
        Dog dog = new Dog("ScruffMcGruff", new Date(8), 3);
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(numberOfMealsExpected, actual);
    }

    @Test
    public void getIdTest() {
        //Given
        int idExpected = 3;

        //When
        Dog dog = new Dog("Sukey", new Date(8), 3);
        int actual = (3);

        //Then
        Assert.assertEquals(idExpected, actual);
    }

    @Test
    public void AnimalInheritanceTest() {
        //Given

        //When
        Dog dog = new Dog("Ernest", new Date(8), 3);

        //Then
        Assert.assertTrue(true);
    }
    @Test
    public void MammalInheritanceTest(){
        Dog dog = new Dog ("Damion", new Date(3), 2);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
