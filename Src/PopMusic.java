public class PopMusic extends MusicStyles {
    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(){
        System.out.println("Грає музика стилю Pop.Гурт "+getName());
    }

}
