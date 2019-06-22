package my_project.interfaces;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private String volume;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    // IoC

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
