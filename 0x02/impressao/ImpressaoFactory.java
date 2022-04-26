public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int qtdColoridas, boolean freteVerso){
        return new Impressao(tamanhoImpressao,totalPaginas, qtdColoridas, freteVerso);
    }

}
