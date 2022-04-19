public class ProgramaPrincipal {
    public static void main(String[] args) {
        Ponto x = new Ponto();
        Ponto y = new Ponto();

        System.out.printf("\nx = %f\ny = %f", x, y);

        System.out.println("p1 -> origem = %f", p1.distancia());
        System.out.println("p2 -> origem = %f", p2.distancia());
        System.out.println("p3 -> origem = %f", p3.distancia());
        
        System.out.println("p1 -> p2 = %f", p1.distancia(p2));
        System.out.println("p2 -> p3 = %f", p1.distancia(p3));
    }
}