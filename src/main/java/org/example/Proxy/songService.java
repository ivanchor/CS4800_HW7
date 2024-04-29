package org.example.Proxy;

import java.util.List;

public interface songService
{
    song searchById(int songID);
    List<song> searchByTitle(String title);
    List<song> searchByAlbum(String album);
}
