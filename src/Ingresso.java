public sealed class Ingresso permits MeiaEntrada, FamiliaEntrada {

    protected double valor;
    protected String nomeFilme;
    protected String linguagem;


    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }


    public Ingresso convert(Ingresso ingresso){
        if (ingresso == null) return this;

        this.valor = ingresso.getValor();
        this.linguagem = ingresso.getLinguagem();
        this.nomeFilme = ingresso.getNomeFilme();

            return this;
    }

    public String testar(){
        return nomeFilme + " em " + linguagem + " custando " + valor;
    }
}