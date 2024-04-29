package org.example.Proxy;

public class song
{
    private int songID;
    private int songDuration;
    private String songTitle;
    private String songAlbum;
    private String songArtist;


    public song(int songID, int songDuration, String songTitle, String songAlbum, String songArtist)
    {
        this.songID = songID;
        this.songDuration = songDuration;
        this.songTitle = songTitle;
        this.songAlbum = songAlbum;
        this.songArtist = songArtist;
    }

    public int getSongID() {
        return songID;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongAlbum() {
        return songAlbum;
    }

    public String getSongArtist() {
        return songArtist;
    }



}
