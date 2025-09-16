public class Principal {
    public static void main(String[] args) {
        Forma meuCirculo = new Circulo(5.0);
        System.out.println("Área do Círculo: " + meuCirculo.area());

        Forma meuRetangulo = new Retangulo(4.0, 6.0);
        System.out.println("Área do Retângulo: " + meuRetangulo.area());
    }
}