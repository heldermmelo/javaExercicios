import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.common.collect.*;


public class Fatorial3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		System.out.print("Entre com o número de que deseja o fatorial");
		int n = leitor.nextInt();
		int f = n;
		int orig=n;
		BiMap<Integer, Integer> tabelaFatorias = HashBiMap.create();
		int fResul=factorial(n,f,orig);
		
		if(tabelaFatorias.containsKey(orig)==true){
			fResul= tabelaFatorias.get(orig);
		}else{
			fResul=factorial(n,f,orig);
			tabelaFatorias.put(orig, fResul);
		}
		
		System.out.println(orig+"!="+fResul );
	}
	
	public static int factorial (int n, int f, int orig) {
		while(n>1){
			
			f= f * (n-1);
			System.out.println(orig+"!="+ f + "*" + (n-1)+"!");
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			n=n-1;
		}
		return f;
		}

}
