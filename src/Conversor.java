import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.google.common.collect.BiMap;

public class Conversor {
	public static void main (String[] args){
		Scanner leitor = new Scanner(System.in);
		System.out.print("Entre com o valor a converter, o ISO da unidade monet�ria atual  e aquela para que deseja a convers�o: ");
		String info =leitor.nextLine();
		if(info.contentEquals("")|| info==null){
			System.out.println("Conversor 0.1, rode novamente inserindo um valor decimal pontuado, e duas unidades monet�rias separando tudo com espa�os em branco."
					+ "\nConvers�es dispon�veis reais do Brasil (BRL) e d�lares americanos (USD)");
			System.exit(0);
		}
		
		String[] partes = info.split(" ");
		
		double valor = Double.parseDouble(partes[0]);
		String unidade1=partes[1];
		String unidade2=partes[2];
		double resultado = converte(valor, unidade1, unidade2);
		System.out.print(resultado);
	}
	static double converte (double valor1, String u1, String u2) {
		
		double valorConvertido;
		double valorBase = valor1;
		switch(u1){
		case "USD": valor1=4.10;
			break;
		case "BRL": valor1=0.24;
				
		}
		valorConvertido = valor1 * valorBase;
		
		return valorConvertido;
	}
	
}
