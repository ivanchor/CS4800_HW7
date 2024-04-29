package org.example.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class characterPropertiesFactory
{
    private static List<characterProperties> charProperties = new ArrayList<>();

    public static characterProperties getCharacterProperties(String font, String color, int size)
    {
        for (characterProperties properties : charProperties)
        {
            if(properties.getFont().equals(font) && properties.getColor().equals(color) && properties.getSize() == size)
            {
                return properties;
            }
        }
        characterProperties newProperties = new characterProperties(font, color, size);
        charProperties.add(newProperties);
        return newProperties;
    }
}
