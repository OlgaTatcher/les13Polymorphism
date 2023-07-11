public class MusicStyles {
    private String name;

    public MusicStyles() {
    }

    public MusicStyles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic(){
        System.out.println("Грає музика стилю "+getName());
    }
}
