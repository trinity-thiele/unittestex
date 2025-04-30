package tests;

import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Snake;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SnakeTests {

    private static Snake actualSnake;

    @BeforeAll
    public static void createAnimals()
    {
        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.SCALES, Gender.UNKNOWN, Breed.UNKNOWN);
    }


    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualSnake.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualSnake.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Snake Speak Pss Tests")
    public void snakeGoesPSSSTest()
    {
        assertEquals("The snake goes PSSS! PSSS!", actualSnake.speak(), "I was expecting PSSS PSSS");
    }

    @Test
    @Order(1)
    @DisplayName("Snake Skin is it Hyperallergetic")
    public void snakeHyperAllergeticTests()
    {
        assertEquals("The snake is hyperallergetic!", actualSnake.snakeHypoallergenic(),
                "The snake is hyperallergetic!");
    }

    @Test
    @Order(1)
    @DisplayName("Snake have no legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualSnake.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Snake Gender Test FeMale")
    public void genderTestFeMale()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.SCALES, Gender.FEMALE, Breed.UNKNOWN);
        assertEquals(Gender.FEMALE, actualSnake.getGender(), "Expecting Male Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Breed Test CORAL")
    public void genderSnakeBreed()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.SCALES, Gender.FEMALE, Breed.CORAL);
        assertEquals(Breed.CORAL, actualSnake.getBreed(), "Expecting Breed CORAL!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Speak Hiss Tests")
    public void snakeGoesHISSTest()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.SCALES,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes HISS! HISS!", actualSnake.speak(), "I was expecting HISS");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Speak Psss Tests")
    public void snakeGoesPsssTest()
    {
        actualSnake = new Snake(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes Psss! Psss!", actualSnake.speak(), "I was expecting Psss");
    }
}
