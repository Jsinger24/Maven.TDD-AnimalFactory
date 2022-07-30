package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDogTest(){
        //Given
        int expected = 1;

        //When
        Dog sampson = new Dog("Sampson", new Date(4), 9);
        DogHouse.add(sampson);
        int actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals( expected, actual);

    }

    @Test
    public void removeDogTest(){
        //Given
        int expected = 1;

        //When
        Dog gambit = new Dog("Gambit", new Date(2), 1);
        Dog bibby = new Dog("Bibby", new Date(4), 9);
        DogHouse.add(bibby);
        DogHouse.add(gambit);
        DogHouse.remove(gambit);
        int actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals( expected, actual);

    }


    @Test
    public void getDogByIDTest(){
        //Given
        Dog expected = new Dog("roxi", new Date(2),3);

        //When
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(3);

        //Then
        Assert.assertEquals( expected, actual);
    }
}
