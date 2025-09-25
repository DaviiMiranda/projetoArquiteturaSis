public class SanduicheDirector {
    private SanduicheBuilder builder;

    public SanduicheDirector(SanduicheBuilder builder) {
        this.builder = builder;
    }

    public void construirSanduiche() {
        builder.buildPao();
        builder.buildQueijo();
        builder.buildAlface();
        builder.buildTomate();
        builder.buildCarne();
        builder.buildMaionese();
    }
}