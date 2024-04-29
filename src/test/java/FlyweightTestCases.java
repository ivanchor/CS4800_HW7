import org.example.*;
import org.example.Flyweight.characterProperties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class FlyweightTestCases
{

    @Test
    public void testCharacterPropertiesGetFont()
    {
        characterProperties charProperties = new characterProperties("Arial", "Red", 12);

        String expected = "Arial";
        String actual = charProperties.getFont();
        assertEquals(expected,actual);
    }

    @Test
    public void testCharacterPropertiesGetColor()
    {
        characterProperties charProperties = new characterProperties("Arial", "Red", 12);

        String expected = "Red";
        String actual = charProperties.getColor();
        assertEquals(expected,actual);
    }

    @Test
    public void testCharacterPropertiesGetSize()
    {
        characterProperties charProperties = new characterProperties("Arial", "Red", 12);

        int expected = 12;
        int actual = charProperties.getSize();
        assertEquals(expected,actual);
    }

    @Test
    public void testCharacterPropertiesToString()
    {
        characterProperties charProperties = new characterProperties("Arial", "Red", 12);

        String expected = "Font: Arial, Color: Red, Size: 12";
        String actual = charProperties.toString();
        assertEquals(expected,actual);
    }

    @Test
    public void testCharacterGetCharacter()
    {
        characterProperties charProperties = new characterProperties("Arial", "Red", 12);

        int expected = 12;
        int actual = charProperties.getSize();
        assertEquals(expected,actual);
    }
}
