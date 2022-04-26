public class PedidoBuilder extends PedidoAbstractBuilder{

    private Pedido pedido;

    TipoLanche tipoLanche;
    TamanhoBatata tamanhoBatata;
    TipoBrinde tipoBrinde;
    TipoBebida tipoBebida;

    ItemPedido itemPedido;

    @Override
    public void setLanche(TipoLanche tipo) {
        tipoLanche = tipo;
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        tamanhoBatata = tamanho;
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        tipoBrinde = tipo;
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        tipoBebida = tipo;
    }

    public Pedido build(){
        return new Pedido(tipoLanche,tamanhoBatata,tipoBrinde,tipoBebida);
    }
}
