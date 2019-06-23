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

//    private void cleanJavaTest() {
//        ClassicalMusic classicalMusic = new ClassicalMusic();
//        System.out.println(classicalMusic.getSong());
//    }

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

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1);
        System.out.println(classicalMusic2);
        context.close();
    }
}
