public class Main {
    public static void main(String[] args) {
        // Criando os objetos protótipos
        Circulo prototipoCirculo = new Circulo();
        Retangulo prototipoRetangulo = new Retangulo();

        // Clonando o círculo
        Circulo circulo1 = (Circulo) prototipoCirculo.clone();
        System.out.print("Círculo 1: ");
        circulo1.desenhar();

        // Clonando o retângulo
        Retangulo retangulo1 = (Retangulo) prototipoRetangulo.clone();
        System.out.print("Retângulo 1: ");
        retangulo1.desenhar();

        // Verificando se as cópias são diferentes dos protótipos
        System.out.println("\nO objeto 'círculo1' é o mesmo que 'prototipoCirculo'? " + (circulo1 == prototipoCirculo));
        System.out.println("O objeto 'retangulo1' é o mesmo que 'prototipoRetangulo'? " + (retangulo1 == prototipoRetangulo));
    }
}