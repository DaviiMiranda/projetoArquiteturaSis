public class SanduicheSimplesBuilder implements SanduicheBuilder{

    private Sanduiche sanduiche;

    public SanduicheSimplesBuilder(){
        this.sanduiche = new Sanduiche();
    }

    @Override
    public void buildPao() {
        sanduiche.setPao("Pão de forma");
    }

    @Override
    public void buildQueijo() {
        sanduiche.setQueijo("Pão de forma");
    }

    @Override
    public void buildTomate() {
        sanduiche.setPao("Pão de forma");
    }

    @Override
    public void buildAlface() {
        sanduiche.setAlface("Pão de forma");
    }
    @Override
    public void buildCarne() {
        sanduiche.setCarne("Pão de forma");
    }
    @Override
    public Sanduiche getSanduiche() {
        return this.sanduiche;
    }
    @Override
    public void buildMaionese() {
        sanduiche.setMaionese("Pão de forma");
    }

}
