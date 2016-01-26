import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Entre copm o número de que deseja o fatorial");
		int n = leitor.nextInt();
		int f = n;
		int orig=n;
		
		while(n>1){
			
			f= f * (n-1);
			n=n-1;
			
		}
		
		System.out.println(orig+"!="+f );
	}

}
