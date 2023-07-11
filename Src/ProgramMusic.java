public class ProgramMusic {
    public static void main(String[] args) {
        MusicStyles performer1=new PopMusic("'StarCompany'");
        MusicStyles performer2=new PopMusic("'BestCrew'");
        MusicStyles performer3=new RockMusic("'RockBest");
        MusicStyles performer4=new RockMusic("'Wolves");
        MusicStyles performer5=new ClassicMusic("Beethoven");
        MusicStyles performer6=new ClassicMusic("Tchaikovsky");

        MusicStyles [] musicStyles={performer1,performer2,performer3,
                performer4,performer5,performer6};
        for(MusicStyles style:musicStyles){
            style.playMusic();
        }


    }

}
