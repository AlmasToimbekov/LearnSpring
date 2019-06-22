package my_project;

import my_project.first_bean.TestBean;
import my_project.interfaces.ClassicalMusic;
import my_project.interfaces.Music;
import my_project.interfaces.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        TestSpring test = new TestSpring();
//        test.firstTest();
        test.musicTest();
    }

    private void firstTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("firstBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }

    private void musicTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer1 = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBean", MusicPlayer.class);

        musicPlayer1.playMusicList();
        musicPlayer2.playMusicList();

        musicPlayer2.setVolume("30");

        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());

        System.out.println(musicPlayer2.getName());
        System.out.println(musicPlayer2.getVolume());

        context.close();
    }
}
