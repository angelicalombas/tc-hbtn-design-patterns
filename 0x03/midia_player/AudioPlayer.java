public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        if(tipoMedia == TipoMedia.MP3){
            System.out.printf("Reproduzindo MP3: " + nome);
        }else if(tipoMedia == TipoMedia.MP4){
            MediaAdapter adapter = new MediaAdapter();
            adapter.reproduzir(tipoMedia, nome);
        }else{
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(TipoMedia.VLC);
            mediaPlayerAdapter.reproduzir(TipoMedia.VLC,nome);
        }
    }
}
