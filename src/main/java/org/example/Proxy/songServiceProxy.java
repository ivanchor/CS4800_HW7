package org.example.Proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class songServiceProxy implements songService {
    private songService songService;
    private Map<Integer, song> songCache;

    public songServiceProxy() {
        this.songService = new songStreamer();
        this.songCache = new HashMap<>();
    }

    @Override
    public song searchById(int songID) {
        song cachedSong = songCache.get(songID);
        if (cachedSong != null) {
            System.out.println("Retrieving song metadata from cache for song ID: " + songID);
            return cachedSong;
        } else {
            song song = songService.searchById(songID);
            if (song != null) {
                songCache.put(songID, song); // Cache the retrieved song
            }
            return song;
        }
    }

    @Override
    public List<song> searchByTitle(String title) {
        return songService.searchByTitle(title);
    }

    @Override
    public List<song> searchByAlbum(String album) {
        return songService.searchByAlbum(album);
    }
}