public class ModernMediaPlayer implements MediaPlayer{
    private MediaPlayer mediaPlayer;
    public ModernMediaPlayer(MediaPlayer mediaPlayer)
    {
        this.mediaPlayer=mediaPlayer;
    }

    @Override
    public void play(String audiotype, String Filename) {
        mediaPlayer.play(audiotype,Filename);
    }
}
