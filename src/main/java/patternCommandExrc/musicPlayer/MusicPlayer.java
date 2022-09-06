package patternCommandExrc.musicPlayer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<String> tracks = Arrays.asList("Track1","Track2","Track3");
    Random random = new Random();
    int currentTrackNumber = 0;

    public void playFirstTrack(){
        System.out.println("Actually playing track is: " + tracks.get(currentTrackNumber));
    }
    public void playNextTrack(){
        currentTrackNumber++;
        if(currentTrackNumber > 2){
            currentTrackNumber = 0;
        }
        System.out.println("Next playing track is: " + tracks.get(currentTrackNumber));

    }
    public void playRandomTrack(){
        currentTrackNumber = random.nextInt(3);
        System.out.println("Random track is: " + tracks.get(currentTrackNumber));
    }
}
