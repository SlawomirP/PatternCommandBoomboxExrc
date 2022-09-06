package patternCommandExrc.musicPlayer;

public class PlayRandomTrack implements MusicPlayerCommand {

    //obiekt na ktorym bedzie wywolywana metoda
    MusicPlayer musicPlayer;

    //trzeba to przezazac do konstruktora zeby miec dostep
    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}
