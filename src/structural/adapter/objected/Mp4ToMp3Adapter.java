package structural.adapter.objected;

/**
 * Created by Krzysztof Adamczyk on 13.07.2017.
 */
public class Mp4ToMp3Adapter implements Player {

    private Mp3Player mp3Player = new Mp3Player();

    @Override
    public void playVideoAndMusic() {
        this.mp3Player.playMusik();
    }
}
