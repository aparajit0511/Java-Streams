package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable playable = new Playable() {
            @Override
            public void play() {
                System.out.println("class playable");
            }
        };

        playable.play();
    }

}
