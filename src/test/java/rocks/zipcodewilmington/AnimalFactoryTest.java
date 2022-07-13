package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void createDogTest(){
        Integer expectedId = DogHouse.getNumberOfDogs();
        Date expectedDate = new Date();
        String expectedName = "Shilah";

        Dog dog = AnimalFactory.createDog(expectedName, expectedDate);

        Integer actualId = dog.getId();
        Date actualDate = dog.getBirthDate();
        String actualName = dog.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedName, actualName);

    }
@Test
    public void createCatTest(){
        Integer expectedId = CatHouse.getNumberOfCats();
        Date expectedDate = new Date();
        String expectedName = "mikko";

        Cat cat = AnimalFactory.createCat(expectedName, expectedDate);

        Integer actualId = cat.getId();
        Date actualDate = cat.getBirthDate();
        String actualName = cat.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedName, actualName);

    }
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
