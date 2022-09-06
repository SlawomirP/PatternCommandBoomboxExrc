package patternCommandExrc.musicPlayer;

public class PlayNextTrack implements MusicPlayerCommand {

    //obiekt na ktorym bedzie wywolywana metoda
    MusicPlayer musicPlayer;

    //trzeba to przezazac do konstruktora zeby miec dostep
    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
