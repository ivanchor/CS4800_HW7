package org.example.Proxy;

import java.util.ArrayList;
import java.util.List;

public class songStreamer implements songService{

    private List<song> songDatabase;

    public songStreamer()
    {
        this.songDatabase = new ArrayList<>();
        songDatabase.add(new song(0, 180, "I Love You", "Love", "John"));
        songDatabase.add(new song(1, 200, "I Don't Love You", "Love", "John"));
        songDatabase.add(new song(2, 180, "I Hate You", "Love", "John"));

        songDatabase.add(new song(3, 220, "Apple Bottom Jeans", "Fur", "Her"));
        songDatabase.add(new song(4, 240, "Boot with the Fur", "Fur", "Her"));
        songDatabase.add(new song(5, 180, "Got the Whole Club", "Lookin", "Her"));

        songDatabase.add(new song(6, 180, "Pears", "Fruits", "Basket"));
        songDatabase.add(new song(7, 100, "Pineapple", "Plants", "Basket"));

        songDatabase.add(new song(8, 200, "Tree", "Fur", "Orangutan"));
        songDatabase.add(new song(9, 420, "Da tree lover", "Plants", "Fauanashi sensei"));

    }
    @Override
    public song searchById(int songID) {
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }

        for(song songs : songDatabase)
        {
            if(songs.getSongID() == songID)
            {
                return songs;
            }
        }
        return null;
    }

    @Override
    public List<song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<song> result = new ArrayList<>();
        for (song songs : songDatabase) {
            if (songs.getSongTitle().equalsIgnoreCase(title)) {
                result.add(songs);
            }
        }
        return result;
    }

    public List<song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<song> result = new ArrayList<>();
        for (song songs : songDatabase) {
            if (songs.getSongAlbum().equalsIgnoreCase(album)) {
                result.add(songs);
            }
        }
        return result;
    }
}
