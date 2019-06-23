package my_project.interfaces;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void initClassical() {
        System.out.println("Classical is being initiated");
    }

    public void destroyClassical() {
        System.out.println("Classical is being destroyed");
    }

    @Override
    public String getSong() {
        return "Sonata";
    }
}
