public class Impressao {

    private int paginasTotais, paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso, valorPretoBrancoFrenteVerso, valorColoridasFrenteApenas, valorPretoBrancoFrenteApenas;
    private double valorTotal;
    private TamanhoImpressao tamanhoImpressao;
    private int paginasBrancoPreto;


    public Impressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int qtdColoridas, boolean freteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = totalPaginas;
        this.paginasColoridas = qtdColoridas;
        this.ehFrenteVerso = freteVerso;
        this.paginasBrancoPreto = totalPaginas - qtdColoridas;
    }

    public double calcularTotal() {
       if (tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso == false){
           valorPretoBrancoFrenteApenas = 0.32;
           valorColoridasFrenteApenas = 0.22;
           valorTotal =  (paginasBrancoPreto*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
       }else if(tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso == true){
           valorPretoBrancoFrenteVerso = 0.28;
           valorColoridasFrenteVerso = 0.18;
           valorTotal = (paginasBrancoPreto*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
       }else if(tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso == false){
           valorPretoBrancoFrenteApenas = 0.30;
           valorColoridasFrenteApenas = 0.20;
           valorTotal =  (paginasBrancoPreto*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
       }else if(tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso == true){
           valorPretoBrancoFrenteVerso = 0.25;
           valorColoridasFrenteVerso = 0.15;
           valorTotal = (paginasBrancoPreto*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
       }else if(tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso == false) {
           valorPretoBrancoFrenteApenas = 0.25;
           valorColoridasFrenteApenas = 0.15;
           valorTotal = (paginasBrancoPreto * valorPretoBrancoFrenteApenas) + (paginasColoridas * valorColoridasFrenteApenas);
       } else if(tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso == true) {
           valorPretoBrancoFrenteVerso = 0.20;
           valorColoridasFrenteVerso = 0.10;
           valorTotal = (paginasBrancoPreto * valorPretoBrancoFrenteVerso) + (paginasColoridas * valorColoridasFrenteVerso);
       }
        return valorTotal;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    @Override
    public String toString() {
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, <frente e verso|frente>, total: R$ %.2f", getPaginasTotais(), getPaginasColoridas(), getPaginasTotais() - getPaginasColoridas(),calcularTotal());
    }

}
