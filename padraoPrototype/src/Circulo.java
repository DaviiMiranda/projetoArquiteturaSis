public class Circulo extends FormaGeometrica {
    public Circulo() {
        this.tipo = "Círculo";
    }

    @Override
    void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}