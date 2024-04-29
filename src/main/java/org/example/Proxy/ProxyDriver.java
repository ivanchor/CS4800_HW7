package org.example.Proxy;

import java.util.List;

public class ProxyDriver {
    public static void main(String[] args) {

        /*
        (ID, Duration, Title, Album, Author)

        (0, 180, "I Love You", "Love", "John")
        (1, 200, "I Don't Love You", "Love", "John")
        (2, 180, "I Hate You", "Love", "John")

        (3, 220, "Apple Bottom Jeans", "Fur", "Her")
        (4, 240, "Boot with the Fur", "Fur", "Her")
        (5, 180, "Got the Whole Club", "Lookin", "Her")

        (6, 180, "Pears", "Fruits", "Basket")
        (7, 100, "Pineapple", "Plants", "Basket")

        (8, 200, "Tree", "Fur", "Orangutan")
        (9, 420, "Da tree lover", "Plants", "Fauanashi sensei")
        */

        songService service = new songServiceProxy();

        song song1 = service.searchById(1);
        System.out.println("Song 1: " + song1.getSongTitle() + " by " + song1.getSongArtist());

        List<song> songsByAlbum = service.searchByAlbum("Fur");
        System.out.println("Songs in Album Fur:");
        for (song song : songsByAlbum) {
            System.out.println(song.getSongTitle() + " by " + song.getSongArtist());
        }


    }
}