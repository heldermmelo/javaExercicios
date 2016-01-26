import java.util.Scanner;

public class Fatorial2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Entre copm o número de que deseja o fatorial");
		int n = leitor.nextInt();
		int f = n;
		int orig=n;
		
		int fResul=factorial(n,f,orig);
		
		System.out.println(orig+"!="+fResul );
	}
	
	public static int factorial (int n, int f, int orig) {
		while(n>1){
			
			f= f * (n-1);
			System.out.println(orig+"!="+ f + "*" + (n-1));
			n=n-1;
		}
		return f;
		}

}
