public abstract class Personagem {
    private String nome;
    private TipoPersonagem tipo;
    private int inteligencia, forca, vigor, resistencia, destreza;

    public Personagem() {
    }

    public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public double getDanoAtaque(){
        return forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPersonagem getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersonagem tipo) {
        this.tipo = tipo;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public String toString() {
      //  return String.format("Personagem { nome = %s, tipo = %s, inteligencia = %d, forca = %d, vigor = %d, resistencia = %d, destreza = %d dano ataque = %2.f }", getNome(), getTipo(), getInteligencia(), getForca(), getVigor(), getResistencia(), getDestreza(), getDanoAtaque());
            return   "Personagem { " +
                    "nome = " + nome +
                    ", tipo = " + tipo +
                    ", inteligencia = " + inteligencia +
                    ", forca = " + forca +
                    ", vigor = " + vigor +
                    ", resistencia = " + resistencia +
                    ", destreza = " + destreza +
                    ", dano ataque = " + String.format("%.2f", getDanoAtaque())+
                    " }";


      /*  return "Personagem{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", inteligencia=" + inteligencia +
                ", forca=" + forca +
                ", vigor=" + vigor +
                ", resistencia=" + resistencia +
                ", destreza=" + destreza +
                ", dano taque = " + getDanoAtaque() +
                '}';*/
    }
}