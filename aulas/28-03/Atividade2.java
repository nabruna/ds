public class Atividade2 {

    public static void main(String[] args){
        System.out.println("Tabuada de 10:");
        int tabu;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tabu = i * j;
                System.out.printf("%d x %d = %d \n", i, j, tabu);
            }
        }
    }

}