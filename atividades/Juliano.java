import java.util.Scanner;
import java.util.Random;
public class Juliano
{
	public static void main(String[] args) {
	    int chutes[] = new int[6];
	    int sorteio[] = new int[6];
	    int numero_chutes = 0;
	    int temp;
	    Random rand = new Random();
	    int upperbound = 59;
	    Scanner myInput = new Scanner( System.in );
	    while (numero_chutes < 6) {
	        System.out.println("Chute um número para a loteria:");
	        temp = myInput.nextInt();
	        if (temp <= 60 && temp >= 1) {
	            chutes[numero_chutes] = temp;
	            numero_chutes++;
	            System.out.println("Você tem mais " + (6-numero_chutes) + " chutes");
	        } else {
	            System.out.println("Número inválido, tente de novo.");
	        }
	    }
	    if (numero_chutes == 6){
	        System.out.println("Temos seus 6 chutes! Vamos ver se você acertou...");
	    }
	    for (int i = 0; i<6; i++){
	        sorteio[i] = rand.nextInt(upperbound) + 1;
	        for (int contador = 0; contador<6;contador++) {
	            if (i != contador) {
	                if (sorteio[i] == sorteio[contador]) {
	                sorteio[i] = rand.nextInt(upperbound) + 1;
	                contador = 0;
	                }
	            } 
	        }
	    }
	    int acertos = 0;
		for (int i = 0; i<6; i++){
		    int j = 0;
	        while (j != 6){
	            if (chutes[i] == sorteio[j]){
	                acertos++;
	            }
	            j++;
	        }
	    }
	    System.out.println("Você acertou " + acertos + " vezes!");
	    System.out.println("Números sorteados:  " + sorteio[0] + " " + sorteio[1] + " " + sorteio[2]+ " " + sorteio[3] + " " + sorteio[4] + " " + sorteio[5]);

        myInput.close();
	}
}