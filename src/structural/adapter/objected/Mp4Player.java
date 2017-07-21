package structural.adapter.objected;

/**
 * Created by Krzysztof Adamczyk on 13.07.2017.
 */
public class Mp4Player implements Player {
    @Override
    public void playVideoAndMusic() {
        System.out.println("Play video and music");
    }
}
