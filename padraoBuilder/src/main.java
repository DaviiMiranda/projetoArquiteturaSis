
public static void main(String[] args) {
    // Constrói um sanduíche simples
    SanduicheBuilder builderSimples = new SanduicheSimplesBuilder();
    SanduicheDirector director = new SanduicheDirector(builderSimples);
    director.construirSanduiche();
    Sanduiche sanduicheSimples = builderSimples.getSanduiche();
    System.out.println(sanduicheSimples);
}
