public non-sealed class MeiaEntrada extends Ingresso {

    public double calcularValorMeia(double valor){
            return valor / 2;

    }
    @Override
    public Ingresso convert(final Ingresso ingresso) {

        switch(ingresso) {
            case MeiaEntrada meiaEntrada ->{
                this.valor = calcularValorMeia(meiaEntrada.getValor());
                this.nomeFilme = meiaEntrada.getNomeFilme();
                this.linguagem = meiaEntrada.getLinguagem();
            } case FamiliaEntrada familiaEntrada ->{
                this.valor =     familiaEntrada.getValor();
                this.nomeFilme = familiaEntrada.getNomeFilme();
                this.linguagem = familiaEntrada.getLinguagem();
            }
            default -> throw new IllegalStateException("Tipo de ingresso inesperado: " + ingresso.getClass().getName());
        } 
        return this;
    }

   
    
}
