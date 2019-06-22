package my_project.interfaces;

public class PopMusic implements Music {
    private String song;

    public PopMusic(String song) {
        this.song = song;
    }

    @Override
    public String getSong() {
        return song;
    }
}
