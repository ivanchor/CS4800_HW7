import org.example.*;
import org.example.Flyweight.characterProperties;
import org.example.Proxy.song;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProxyTestCases
{

    @Test
    public void testGetSongID()
    {
        song song = new song(1, 180, "Song Title", "Song Album", "Song Artist");

        int expected = 1;
        int actual = song.getSongID();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetSongDuration()
    {
        song song = new song(1, 180, "Song Title", "Song Album", "Song Artist");

        int expected = 180;
        int actual = song.getSongDuration();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetSongTitle()
    {
        song song = new song(1, 180, "Song Title", "Song Album", "Song Artist");

        String expected = "Song Title";
        String actual = song.getSongTitle();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetSongAlbum()
    {
        song song = new song(1, 180, "Song Title", "Song Album", "Song Artist");

        String expected = "Song Album";
        String actual = song.getSongAlbum();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetSongArtist()
    {
        song song = new song(1, 180, "Song Title", "Song Album", "Song Artist");

        String expected = "Song Artist";
        String actual = song.getSongArtist();
        assertEquals(expected,actual);
    }
}
