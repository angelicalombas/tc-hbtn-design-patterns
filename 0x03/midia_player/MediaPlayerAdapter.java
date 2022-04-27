public class MediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if(tipoMedia != TipoMedia.MP3){
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        if(tipoMedia == TipoMedia.VLC){
            advancedMediaPlayer.reproduzirVlc(TipoMedia.VLC, nome);
        }
    }
}
