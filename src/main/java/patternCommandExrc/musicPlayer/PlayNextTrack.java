package patternCommandExrc.musicPlayer;

public class PlayNextTrack implements MusicPlayerCommand {
    MusicPlayer musicPlayer;
    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
