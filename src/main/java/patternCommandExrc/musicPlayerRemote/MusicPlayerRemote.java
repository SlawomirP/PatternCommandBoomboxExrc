package patternCommandExrc.musicPlayerRemote;

import patternCommandExrc.musicPlayer.MusicPlayerCommand;

public class MusicPlayerRemote {

    private MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton(){
       musicPlayerCommand.play();
    }
}
