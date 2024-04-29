package org.example.Flyweight;

public class character
{
    private char character;
    private characterProperties properties;

    public character(char character, characterProperties properties)
    {
        this.character = character;
        this.properties = properties;
    }

    public char getCharacter()
    {
        return character;
    }

    public String getFont()
    {
        return properties.getFont();
    }

    public String getColor()
    {
        return properties.getColor();
    }

    public int getSize()
    {
        return properties.getSize();
    }

    public void print()
    {
        System.out.println("Character: " + character + ", " + properties.toString());
    }
}
