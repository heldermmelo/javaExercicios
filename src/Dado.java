import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		int lados;
		int quantos;
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		System.out.print("Quantos lados vai querer no seu dado?:");
		lados = leitor.nextInt();
		System.out.print("Quantos dados vai querer lançar?:");
		quantos = leitor.nextInt();
		lancamento(lados,quantos);
	}
	
	public static ArrayList<Integer> lancamento(int nLados, int nDados){
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		Random alea = new Random();
		while (nDados>0){
			
			resultados.add(alea.nextInt(nLados)+1);
			nDados--;
		}
		for(int i=0; i<resultados.size(); i++){
			System.out.println(resultados.get(i).toString());
		}
		
		return resultados;
	}

}
