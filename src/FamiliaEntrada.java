public non-sealed class FamiliaEntrada extends Ingresso {
    
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorFamilia(double valor){
            return (valor * quantidade) * 0.5;
        
    }

    @Override
    public Ingresso convert(Ingresso ingresso) {

        switch(ingresso) {
            case MeiaEntrada meiaEntrada ->{
                this.valor = meiaEntrada.getValor();
                this.nomeFilme = meiaEntrada.getNomeFilme();
                this.linguagem = meiaEntrada.getLinguagem();
            } case FamiliaEntrada familiaEntrada ->{
                this.valor =     calcularValorFamilia(familiaEntrada.getValor());
                this.nomeFilme = familiaEntrada.getNomeFilme();
                this.linguagem = familiaEntrada.getLinguagem();
            }
            default -> throw new IllegalStateException("Tipo de ingresso inesperado: " + ingresso.getClass().getName());
        } 
        return this;
    }

    @Override
    public String testar() {
        // TODO Auto-generated method stub
        return super.testar() + " e com " + this.quantidade + " pessoas";
    }

    

}
