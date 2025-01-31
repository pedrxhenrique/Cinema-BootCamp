public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===========================");
        Ingresso meia = new MeiaEntrada();

        meia.setLinguagem("Dublado");
        meia.setNomeFilme("A volta dos q n foram");
        meia.setValor(10.0);

        MeiaEntrada meiaEntry = new MeiaEntrada();
        meiaEntry.convert(meia);

        System.out.println(meiaEntry.testar());

        System.out.println("===========================");

        Ingresso familia = new FamiliaEntrada();

        familia.setNomeFilme("Harry Potter");
        familia.setLinguagem("Legendado");
        familia.setValor(5.0);

        FamiliaEntrada family = new FamiliaEntrada();
        family.setQuantidade(10);

        family.convert(familia);

        System.out.println(family.testar());
        System.out.println("===========================");
    }
}
