public class MediaAdapter implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        System.out.printf("Reproduzindo MP4: " + nome);
    }
}
