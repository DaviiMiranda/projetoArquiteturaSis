public class Retangulo extends FormaGeometrica {
    public Retangulo() {
        this.tipo = "Retângulo";
    }

    @Override
    void desenhar() {
        System.out.println("Desenhando um retângulo.");
    }
}