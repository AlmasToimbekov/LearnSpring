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

//        Music musicBean = context.getBean("musicBean", Music.class);
//        System.out.println(musicBean.getSong());

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
