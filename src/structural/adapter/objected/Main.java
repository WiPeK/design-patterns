package structural.adapter.objected;

/**
 * Created by Krzysztof Adamczyk on 13.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        Player player = new Mp4Player();
        player.playVideoAndMusic();
        player = new Mp4ToMp3Adapter();
        player.playVideoAndMusic();
    }
}
