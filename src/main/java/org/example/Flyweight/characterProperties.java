package org.example.Flyweight;

public class characterProperties
{
    private String font;
    private String color;
    private int size;

    public characterProperties(String font, String color, int size){
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public String getFont()
    {
        return font;
    }

    public String getColor()
    {
        return color;
    }

    public int getSize()
    {
        return size;
    }

    public String toString(){
        return ("Font: " + font + ", Color: " + color + ", Size: " + size);
    }

}
