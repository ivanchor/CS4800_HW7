package org.example.Flyweight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class document
{
    private List<character> characters = new ArrayList<>();
    public void addCharacter(char character, String font, String color, int size)
    {
        characterProperties properties = characterPropertiesFactory.getCharacterProperties(font, color, size);
        characters.add(new character(character, properties));
    }
    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (character character : characters) {
                writer.println(character.getCharacter() + "," + character.getFont() + "," +
                        character.getColor() + "," + character.getSize());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static document loadFromFile(String filename) {
        document document = new document();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                char character = parts[0].charAt(0);
                String font = parts[1];
                String color = parts[2];
                int size = Integer.parseInt(parts[3]);
                document.addCharacter(character, font, color, size);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }

    public void displayCharacters() {
        for (character character : characters) {
            character.print();
        }
    }
}
