package patternCommandExrc.musicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand {

    //obiekt na ktorym bedzie wywolywana metoda
    MusicPlayer musicPlayer;

    //trzeba to przezazac do konstruktora zeby miec dostep
    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
