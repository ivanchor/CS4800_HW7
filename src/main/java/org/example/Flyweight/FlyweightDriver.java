package org.example.Flyweight;

public class FlyweightDriver {
    public static void main(String[] args) {
        document doc = new document();

        doc.addCharacter('H', "Arial", "Red", 12);
        doc.addCharacter('e', "Arial", "Red", 12);
        doc.addCharacter('l', "Calibri", "Blue", 14);
        doc.addCharacter('l', "Verdana", "Black", 16);
        doc.addCharacter('o', "Verdana", "Black", 12);

        doc.saveToFile("HelloWorldCS5800.txt");

        document loadedDoc = document.loadFromFile("HelloWorldCS5800.txt");

        loadedDoc.displayCharacters();
    }
}