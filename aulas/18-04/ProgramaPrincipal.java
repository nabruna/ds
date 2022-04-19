public class ProgramaPrincipal {
    public static void main(String[] args) {
        Ponto x = new Ponto();
        Ponto y = new Ponto();
        
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(5, 10);
        Ponto p3 = new Ponto(7, 10);

        System.out.printf("\nx = %f\ny = %f", x, y);

        System.out.printf("p1 -> origem = %f", p1.distancia());
        System.out.printf("p2 -> origem = %f", p2.distancia());
        System.out.printf("p3 -> origem = %f", p3.distancia());
        
        System.out.printf("p1 -> p2 = %f", p1.distancia(p2));
        System.out.printf("p2 -> p3 = %f", p1.distancia(p3));
    }
}