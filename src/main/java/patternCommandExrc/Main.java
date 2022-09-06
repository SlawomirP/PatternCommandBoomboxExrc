package patternCommandExrc;

import patternCommandExrc.musicPlayer.MusicPlayer;
import patternCommandExrc.musicPlayer.PlayFirstTrack;
import patternCommandExrc.musicPlayer.PlayNextTrack;
import patternCommandExrc.musicPlayerRemote.MusicPlayerRemote;

public class Main{
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
    }
}
